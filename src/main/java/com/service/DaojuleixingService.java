package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaojuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaojuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaojuleixingView;


/**
 * 道具类型
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuleixingService extends IService<DaojuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaojuleixingVO> selectListVO(Wrapper<DaojuleixingEntity> wrapper);
   	
   	DaojuleixingVO selectVO(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
   	
   	List<DaojuleixingView> selectListView(Wrapper<DaojuleixingEntity> wrapper);
   	
   	DaojuleixingView selectView(@Param("ew") Wrapper<DaojuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaojuleixingEntity> wrapper);
   	

}

