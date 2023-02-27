package com.entity.view;

import com.entity.ShixinmingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失信名单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@TableName("shixinmingdan")
public class ShixinmingdanView  extends ShixinmingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixinmingdanView(){
	}
 
 	public ShixinmingdanView(ShixinmingdanEntity shixinmingdanEntity){
 	try {
			BeanUtils.copyProperties(this, shixinmingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
