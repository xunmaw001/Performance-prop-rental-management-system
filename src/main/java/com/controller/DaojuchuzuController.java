package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DaojuchuzuEntity;
import com.entity.view.DaojuchuzuView;

import com.service.DaojuchuzuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 道具出租
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
@RestController
@RequestMapping("/daojuchuzu")
public class DaojuchuzuController {
    @Autowired
    private DaojuchuzuService daojuchuzuService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaojuchuzuEntity daojuchuzu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			daojuchuzu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaojuchuzuEntity> ew = new EntityWrapper<DaojuchuzuEntity>();
    	PageUtils page = daojuchuzuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuchuzu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaojuchuzuEntity daojuchuzu, 
		HttpServletRequest request){
        EntityWrapper<DaojuchuzuEntity> ew = new EntityWrapper<DaojuchuzuEntity>();
    	PageUtils page = daojuchuzuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuchuzu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaojuchuzuEntity daojuchuzu){
       	EntityWrapper<DaojuchuzuEntity> ew = new EntityWrapper<DaojuchuzuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daojuchuzu, "daojuchuzu")); 
        return R.ok().put("data", daojuchuzuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaojuchuzuEntity daojuchuzu){
        EntityWrapper< DaojuchuzuEntity> ew = new EntityWrapper< DaojuchuzuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daojuchuzu, "daojuchuzu")); 
		DaojuchuzuView daojuchuzuView =  daojuchuzuService.selectView(ew);
		return R.ok("查询道具出租成功").put("data", daojuchuzuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaojuchuzuEntity daojuchuzu = daojuchuzuService.selectById(id);
        return R.ok().put("data", daojuchuzu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaojuchuzuEntity daojuchuzu = daojuchuzuService.selectById(id);
        return R.ok().put("data", daojuchuzu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaojuchuzuEntity daojuchuzu, HttpServletRequest request){
    	daojuchuzu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuchuzu);

        daojuchuzuService.insert(daojuchuzu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaojuchuzuEntity daojuchuzu, HttpServletRequest request){
    	daojuchuzu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuchuzu);

        daojuchuzuService.insert(daojuchuzu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DaojuchuzuEntity daojuchuzu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daojuchuzu);
        daojuchuzuService.updateById(daojuchuzu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daojuchuzuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DaojuchuzuEntity> wrapper = new EntityWrapper<DaojuchuzuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = daojuchuzuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
