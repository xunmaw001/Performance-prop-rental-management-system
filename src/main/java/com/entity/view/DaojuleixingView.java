package com.entity.view;

import com.entity.DaojuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 道具类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
@TableName("daojuleixing")
public class DaojuleixingView  extends DaojuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaojuleixingView(){
	}
 
 	public DaojuleixingView(DaojuleixingEntity daojuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, daojuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
