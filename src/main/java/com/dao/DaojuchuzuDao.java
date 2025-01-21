package com.dao;

import com.entity.DaojuchuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaojuchuzuVO;
import com.entity.view.DaojuchuzuView;


/**
 * 道具出租
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuchuzuDao extends BaseMapper<DaojuchuzuEntity> {
	
	List<DaojuchuzuVO> selectListVO(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
	
	DaojuchuzuVO selectVO(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
	
	List<DaojuchuzuView> selectListView(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);

	List<DaojuchuzuView> selectListView(Pagination page,@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
	
	DaojuchuzuView selectView(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
	

}
