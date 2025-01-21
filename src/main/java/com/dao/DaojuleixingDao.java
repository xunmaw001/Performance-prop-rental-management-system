package com.dao;

import com.entity.DaojuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaojuleixingVO;
import com.entity.view.DaojuleixingView;


/**
 * 道具类型
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuleixingDao extends BaseMapper<DaojuleixingEntity> {
	
	List<DaojuleixingVO> selectListVO(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
	
	DaojuleixingVO selectVO(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
	
	List<DaojuleixingView> selectListView(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);

	List<DaojuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
	
	DaojuleixingView selectView(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
	

}
