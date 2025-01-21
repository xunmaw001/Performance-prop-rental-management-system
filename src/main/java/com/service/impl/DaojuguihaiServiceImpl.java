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


import com.dao.DaojuguihaiDao;
import com.entity.DaojuguihaiEntity;
import com.service.DaojuguihaiService;
import com.entity.vo.DaojuguihaiVO;
import com.entity.view.DaojuguihaiView;

@Service("daojuguihaiService")
public class DaojuguihaiServiceImpl extends ServiceImpl<DaojuguihaiDao, DaojuguihaiEntity> implements DaojuguihaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaojuguihaiEntity> page = this.selectPage(
                new Query<DaojuguihaiEntity>(params).getPage(),
                new EntityWrapper<DaojuguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaojuguihaiEntity> wrapper) {
		  Page<DaojuguihaiView> page =new Query<DaojuguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaojuguihaiVO> selectListVO(Wrapper<DaojuguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaojuguihaiVO selectVO(Wrapper<DaojuguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaojuguihaiView> selectListView(Wrapper<DaojuguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaojuguihaiView selectView(Wrapper<DaojuguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
