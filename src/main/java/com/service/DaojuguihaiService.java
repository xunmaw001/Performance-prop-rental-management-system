package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaojuguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaojuguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaojuguihaiView;


/**
 * 道具归还
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DaojuguihaiService extends IService<DaojuguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaojuguihaiVO> selectListVO(Wrapper<DaojuguihaiEntity> wrapper);
   	
   	DaojuguihaiVO selectVO(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
   	
   	List<DaojuguihaiView> selectListView(Wrapper<DaojuguihaiEntity> wrapper);
   	
   	DaojuguihaiView selectView(@Param("ew") Wrapper<DaojuguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaojuguihaiEntity> wrapper);
   	

}

