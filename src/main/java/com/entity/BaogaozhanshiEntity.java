package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 报告展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@TableName("baogaozhanshi")
public class BaogaozhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaogaozhanshiEntity() {
		
	}
	
	public BaogaozhanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 实验名称
	 */
					
	private String shiyanmingcheng;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 实验报告
	 */
					
	private String shiyanbaogao;
	
	/**
	 * 实验过程
	 */
					
	private String shiyanguocheng;
	
	/**
	 * 实验结果
	 */
					
	private String shiyanjieguo;
	
	/**
	 * 实验总结
	 */
					
	private String shiyanzongjie;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 老师账号
	 */
					
	private String laoshizhanghao;
	
	/**
	 * 老师姓名
	 */
					
	private String laoshixingming;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：实验名称
	 */
	public void setShiyanmingcheng(String shiyanmingcheng) {
		this.shiyanmingcheng = shiyanmingcheng;
	}
	/**
	 * 获取：实验名称
	 */
	public String getShiyanmingcheng() {
		return shiyanmingcheng;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：实验报告
	 */
	public void setShiyanbaogao(String shiyanbaogao) {
		this.shiyanbaogao = shiyanbaogao;
	}
	/**
	 * 获取：实验报告
	 */
	public String getShiyanbaogao() {
		return shiyanbaogao;
	}
	/**
	 * 设置：实验过程
	 */
	public void setShiyanguocheng(String shiyanguocheng) {
		this.shiyanguocheng = shiyanguocheng;
	}
	/**
	 * 获取：实验过程
	 */
	public String getShiyanguocheng() {
		return shiyanguocheng;
	}
	/**
	 * 设置：实验结果
	 */
	public void setShiyanjieguo(String shiyanjieguo) {
		this.shiyanjieguo = shiyanjieguo;
	}
	/**
	 * 获取：实验结果
	 */
	public String getShiyanjieguo() {
		return shiyanjieguo;
	}
	/**
	 * 设置：实验总结
	 */
	public void setShiyanzongjie(String shiyanzongjie) {
		this.shiyanzongjie = shiyanzongjie;
	}
	/**
	 * 获取：实验总结
	 */
	public String getShiyanzongjie() {
		return shiyanzongjie;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：老师账号
	 */
	public void setLaoshizhanghao(String laoshizhanghao) {
		this.laoshizhanghao = laoshizhanghao;
	}
	/**
	 * 获取：老师账号
	 */
	public String getLaoshizhanghao() {
		return laoshizhanghao;
	}
	/**
	 * 设置：老师姓名
	 */
	public void setLaoshixingming(String laoshixingming) {
		this.laoshixingming = laoshixingming;
	}
	/**
	 * 获取：老师姓名
	 */
	public String getLaoshixingming() {
		return laoshixingming;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
