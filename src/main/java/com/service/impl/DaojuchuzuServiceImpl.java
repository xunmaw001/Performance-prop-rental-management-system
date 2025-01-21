package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DaojuchuzuDao;
import com.entity.DaojuchuzuEntity;
import com.service.DaojuchuzuService;
import com.entity.vo.DaojuchuzuVO;
import com.entity.view.DaojuchuzuView;

@Service("daojuchuzuService")
public class DaojuchuzuServiceImpl extends ServiceImpl<DaojuchuzuDao, DaojuchuzuEntity> implements DaojuchuzuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaojuchuzuEntity> page = this.selectPage(
                new Query<DaojuchuzuEntity>(params).getPage(),
                new EntityWrapper<DaojuchuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaojuchuzuEntity> wrapper) {
		  Page<DaojuchuzuView> page =new Query<DaojuchuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaojuchuzuVO> selectListVO(Wrapper<DaojuchuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaojuchuzuVO selectVO(Wrapper<DaojuchuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaojuchuzuView> selectListView(Wrapper<DaojuchuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaojuchuzuView selectView(Wrapper<DaojuchuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
