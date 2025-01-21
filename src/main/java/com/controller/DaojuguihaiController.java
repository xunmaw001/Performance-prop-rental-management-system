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

import com.entity.DaojuguihaiEntity;
import com.entity.view.DaojuguihaiView;

import com.service.DaojuguihaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 道具归还
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
@RestController
@RequestMapping("/daojuguihai")
public class DaojuguihaiController {
    @Autowired
    private DaojuguihaiService daojuguihaiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaojuguihaiEntity daojuguihai, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			daojuguihai.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			daojuguihai.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaojuguihaiEntity> ew = new EntityWrapper<DaojuguihaiEntity>();
    	PageUtils page = daojuguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuguihai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaojuguihaiEntity daojuguihai, 
		HttpServletRequest request){
        EntityWrapper<DaojuguihaiEntity> ew = new EntityWrapper<DaojuguihaiEntity>();
    	PageUtils page = daojuguihaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daojuguihai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaojuguihaiEntity daojuguihai){
       	EntityWrapper<DaojuguihaiEntity> ew = new EntityWrapper<DaojuguihaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daojuguihai, "daojuguihai")); 
        return R.ok().put("data", daojuguihaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaojuguihaiEntity daojuguihai){
        EntityWrapper< DaojuguihaiEntity> ew = new EntityWrapper< DaojuguihaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daojuguihai, "daojuguihai")); 
		DaojuguihaiView daojuguihaiView =  daojuguihaiService.selectView(ew);
		return R.ok("查询道具归还成功").put("data", daojuguihaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaojuguihaiEntity daojuguihai = daojuguihaiService.selectById(id);
        return R.ok().put("data", daojuguihai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaojuguihaiEntity daojuguihai = daojuguihaiService.selectById(id);
        return R.ok().put("data", daojuguihai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaojuguihaiEntity daojuguihai, HttpServletRequest request){
    	daojuguihai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuguihai);

        daojuguihaiService.insert(daojuguihai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaojuguihaiEntity daojuguihai, HttpServletRequest request){
    	daojuguihai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daojuguihai);

        daojuguihaiService.insert(daojuguihai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DaojuguihaiEntity daojuguihai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daojuguihai);
        daojuguihaiService.updateById(daojuguihai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daojuguihaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DaojuguihaiEntity> wrapper = new EntityWrapper<DaojuguihaiEntity>();
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
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = daojuguihaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
