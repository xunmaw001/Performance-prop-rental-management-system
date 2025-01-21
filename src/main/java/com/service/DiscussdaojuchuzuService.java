package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdaojuchuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdaojuchuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdaojuchuzuView;


/**
 * 道具出租评论表
 *
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public interface DiscussdaojuchuzuService extends IService<DiscussdaojuchuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdaojuchuzuVO> selectListVO(Wrapper<DiscussdaojuchuzuEntity> wrapper);
   	
   	DiscussdaojuchuzuVO selectVO(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
   	
   	List<DiscussdaojuchuzuView> selectListView(Wrapper<DiscussdaojuchuzuEntity> wrapper);
   	
   	DiscussdaojuchuzuView selectView(@Param("ew") Wrapper<DiscussdaojuchuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdaojuchuzuEntity> wrapper);
   	

}

