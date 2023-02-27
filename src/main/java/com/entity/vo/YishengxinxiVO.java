package com.entity.vo;

import com.entity.YishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 医生信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public class YishengxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
