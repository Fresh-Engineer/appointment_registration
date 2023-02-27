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
 * 医生信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@TableName("yishengxinxi")
public class YishengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YishengxinxiEntity() {
		
	}
	
	public YishengxinxiEntity(T t) {
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
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 所属医院
	 */
					
	private String suoshuyiyuan;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	/**
	 * 职称
	 */
					
	private String zhicheng;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 医生详情
	 */
					
	private String yishengxiangqing;
	
	/**
	 * 擅长疾病
	 */
					
	private String shanzhangjibing;
	
	/**
	 * 挂号须知
	 */
					
	private String guahaoxuzhi;
	
	
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
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：所属医院
	 */
	public void setSuoshuyiyuan(String suoshuyiyuan) {
		this.suoshuyiyuan = suoshuyiyuan;
	}
	/**
	 * 获取：所属医院
	 */
	public String getSuoshuyiyuan() {
		return suoshuyiyuan;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：职称
	 */
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：医生详情
	 */
	public void setYishengxiangqing(String yishengxiangqing) {
		this.yishengxiangqing = yishengxiangqing;
	}
	/**
	 * 获取：医生详情
	 */
	public String getYishengxiangqing() {
		return yishengxiangqing;
	}
	/**
	 * 设置：擅长疾病
	 */
	public void setShanzhangjibing(String shanzhangjibing) {
		this.shanzhangjibing = shanzhangjibing;
	}
	/**
	 * 获取：擅长疾病
	 */
	public String getShanzhangjibing() {
		return shanzhangjibing;
	}
	/**
	 * 设置：挂号须知
	 */
	public void setGuahaoxuzhi(String guahaoxuzhi) {
		this.guahaoxuzhi = guahaoxuzhi;
	}
	/**
	 * 获取：挂号须知
	 */
	public String getGuahaoxuzhi() {
		return guahaoxuzhi;
	}

}
