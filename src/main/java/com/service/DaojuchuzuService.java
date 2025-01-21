package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaojuchuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaojuchuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaojuchuzuView;


/**
 * 道具出租
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuchuzuService extends IService<DaojuchuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaojuchuzuVO> selectListVO(Wrapper<DaojuchuzuEntity> wrapper);
   	
   	DaojuchuzuVO selectVO(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
   	
   	List<DaojuchuzuView> selectListView(Wrapper<DaojuchuzuEntity> wrapper);
   	
   	DaojuchuzuView selectView(@Param("ew") Wrapper<DaojuchuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaojuchuzuEntity> wrapper);
   	

}

