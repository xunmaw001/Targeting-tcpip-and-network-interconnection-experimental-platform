package com.entity.vo;

import com.entity.ShiyanchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 实验成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public class ShiyanchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 老师账号
	 */
	
	private String laoshizhanghao;
		
	/**
	 * 老师姓名
	 */
	
	private String laoshixingming;
		
	/**
	 * 老师评分
	 */
	
	private Float laoshipingfen;
		
	/**
	 * 老师比例
	 */
	
	private Float laoshibili;
		
	/**
	 * 学生评分
	 */
	
	private Float xueshengpingfen;
		
	/**
	 * 学生比例
	 */
	
	private Float xueshengbili;
		
	/**
	 * 完成互评
	 */
	
	private Float wanchenghuping;
		
	/**
	 * 互评比例
	 */
	
	private Float hupingbili;
		
	/**
	 * 成绩
	 */
	
	private Float chengji;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：老师评分
	 */
	 
	public void setLaoshipingfen(Float laoshipingfen) {
		this.laoshipingfen = laoshipingfen;
	}
	
	/**
	 * 获取：老师评分
	 */
	public Float getLaoshipingfen() {
		return laoshipingfen;
	}
				
	
	/**
	 * 设置：老师比例
	 */
	 
	public void setLaoshibili(Float laoshibili) {
		this.laoshibili = laoshibili;
	}
	
	/**
	 * 获取：老师比例
	 */
	public Float getLaoshibili() {
		return laoshibili;
	}
				
	
	/**
	 * 设置：学生评分
	 */
	 
	public void setXueshengpingfen(Float xueshengpingfen) {
		this.xueshengpingfen = xueshengpingfen;
	}
	
	/**
	 * 获取：学生评分
	 */
	public Float getXueshengpingfen() {
		return xueshengpingfen;
	}
				
	
	/**
	 * 设置：学生比例
	 */
	 
	public void setXueshengbili(Float xueshengbili) {
		this.xueshengbili = xueshengbili;
	}
	
	/**
	 * 获取：学生比例
	 */
	public Float getXueshengbili() {
		return xueshengbili;
	}
				
	
	/**
	 * 设置：完成互评
	 */
	 
	public void setWanchenghuping(Float wanchenghuping) {
		this.wanchenghuping = wanchenghuping;
	}
	
	/**
	 * 获取：完成互评
	 */
	public Float getWanchenghuping() {
		return wanchenghuping;
	}
				
	
	/**
	 * 设置：互评比例
	 */
	 
	public void setHupingbili(Float hupingbili) {
		this.hupingbili = hupingbili;
	}
	
	/**
	 * 获取：互评比例
	 */
	public Float getHupingbili() {
		return hupingbili;
	}
				
	
	/**
	 * 设置：成绩
	 */
	 
	public void setChengji(Float chengji) {
		this.chengji = chengji;
	}
	
	/**
	 * 获取：成绩
	 */
	public Float getChengji() {
		return chengji;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
