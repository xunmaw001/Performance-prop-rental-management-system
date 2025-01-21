package com.entity.view;

import com.entity.DaojuguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 道具归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
@TableName("daojuguihai")
public class DaojuguihaiView  extends DaojuguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaojuguihaiView(){
	}
 
 	public DaojuguihaiView(DaojuguihaiEntity daojuguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, daojuguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
