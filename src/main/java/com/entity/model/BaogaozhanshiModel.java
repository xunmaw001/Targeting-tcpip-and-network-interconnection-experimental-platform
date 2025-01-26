package com.entity.model;

import com.entity.BaogaozhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 报告展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public class BaogaozhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
