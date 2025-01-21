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


import com.dao.DaojuleixingDao;
import com.entity.DaojuleixingEntity;
import com.service.DaojuleixingService;
import com.entity.vo.DaojuleixingVO;
import com.entity.view.DaojuleixingView;

@Service("daojuleixingService")
public class DaojuleixingServiceImpl extends ServiceImpl<DaojuleixingDao, DaojuleixingEntity> implements DaojuleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaojuleixingEntity> page = this.selectPage(
                new Query<DaojuleixingEntity>(params).getPage(),
                new EntityWrapper<DaojuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaojuleixingEntity> wrapper) {
		  Page<DaojuleixingView> page =new Query<DaojuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaojuleixingVO> selectListVO(Wrapper<DaojuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaojuleixingVO selectVO(Wrapper<DaojuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaojuleixingView> selectListView(Wrapper<DaojuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaojuleixingView selectView(Wrapper<DaojuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
