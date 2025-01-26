package com.entity.view;

import com.entity.ShiyancuijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验催缴
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@TableName("shiyancuijiao")
public class ShiyancuijiaoView  extends ShiyancuijiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyancuijiaoView(){
	}
 
 	public ShiyancuijiaoView(ShiyancuijiaoEntity shiyancuijiaoEntity){
 	try {
			BeanUtils.copyProperties(this, shiyancuijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
