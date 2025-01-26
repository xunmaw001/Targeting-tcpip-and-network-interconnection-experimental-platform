package com.entity.view;

import com.entity.BaogaozhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报告展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@TableName("baogaozhanshi")
public class BaogaozhanshiView  extends BaogaozhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaogaozhanshiView(){
	}
 
 	public BaogaozhanshiView(BaogaozhanshiEntity baogaozhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, baogaozhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
