package com.entity.view;

import com.entity.JigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 机构
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@TableName("jigou")
public class JigouView  extends JigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JigouView(){
	}
 
 	public JigouView(JigouEntity jigouEntity){
 	try {
			BeanUtils.copyProperties(this, jigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
