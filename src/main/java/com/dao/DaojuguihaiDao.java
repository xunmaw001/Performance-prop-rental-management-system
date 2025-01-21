package com.dao;

import com.entity.DaojuguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaojuguihaiVO;
import com.entity.view.DaojuguihaiView;


/**
 * 道具归还
 * 
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuguihaiDao extends BaseMapper<DaojuguihaiEntity> {
	
	List<DaojuguihaiVO> selectListVO(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
	
	DaojuguihaiVO selectVO(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
	
	List<DaojuguihaiView> selectListView(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);

	List<DaojuguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
	
	DaojuguihaiView selectView(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
	

}
