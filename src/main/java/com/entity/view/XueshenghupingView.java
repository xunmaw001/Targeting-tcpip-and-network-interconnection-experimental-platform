package com.entity.view;

import com.entity.XueshenghupingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生互评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@TableName("xueshenghuping")
public class XueshenghupingView  extends XueshenghupingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshenghupingView(){
	}
 
 	public XueshenghupingView(XueshenghupingEntity xueshenghupingEntity){
 	try {
			BeanUtils.copyProperties(this, xueshenghupingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
