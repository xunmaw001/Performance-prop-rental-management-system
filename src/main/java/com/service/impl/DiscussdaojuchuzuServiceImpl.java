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


import com.dao.DiscussdaojuchuzuDao;
import com.entity.DiscussdaojuchuzuEntity;
import com.service.DiscussdaojuchuzuService;
import com.entity.vo.DiscussdaojuchuzuVO;
import com.entity.view.DiscussdaojuchuzuView;

@Service("discussdaojuchuzuService")
public class DiscussdaojuchuzuServiceImpl extends ServiceImpl<DiscussdaojuchuzuDao, DiscussdaojuchuzuEntity> implements DiscussdaojuchuzuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdaojuchuzuEntity> page = this.selectPage(
                new Query<DiscussdaojuchuzuEntity>(params).getPage(),
                new EntityWrapper<DiscussdaojuchuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdaojuchuzuEntity> wrapper) {
		  Page<DiscussdaojuchuzuView> page =new Query<DiscussdaojuchuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdaojuchuzuVO> selectListVO(Wrapper<DiscussdaojuchuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdaojuchuzuVO selectVO(Wrapper<DiscussdaojuchuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdaojuchuzuView> selectListView(Wrapper<DiscussdaojuchuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdaojuchuzuView selectView(Wrapper<DiscussdaojuchuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
