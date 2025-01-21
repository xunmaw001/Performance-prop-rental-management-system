package com.dao;

import com.entity.DiscussdaojuchuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdaojuchuzuVO;
import com.entity.view.DiscussdaojuchuzuView;


/**
 * 道具出租评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DiscussdaojuchuzuDao extends BaseMapper<DiscussdaojuchuzuEntity> {
	
	List<DiscussdaojuchuzuVO> selectListVO(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
	
	DiscussdaojuchuzuVO selectVO(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
	
	List<DiscussdaojuchuzuView> selectListView(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);

	List<DiscussdaojuchuzuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
	
	DiscussdaojuchuzuView selectView(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
	

}
