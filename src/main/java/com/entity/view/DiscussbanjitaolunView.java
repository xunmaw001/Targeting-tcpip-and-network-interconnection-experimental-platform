package com.entity.view;

import com.entity.DiscussbanjitaolunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级讨论评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:50
 */
@TableName("discussbanjitaolun")
public class DiscussbanjitaolunView  extends DiscussbanjitaolunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbanjitaolunView(){
	}
 
 	public DiscussbanjitaolunView(DiscussbanjitaolunEntity discussbanjitaolunEntity){
 	try {
			BeanUtils.copyProperties(this, discussbanjitaolunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
