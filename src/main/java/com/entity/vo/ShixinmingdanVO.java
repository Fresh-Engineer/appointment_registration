package com.entity.vo;

import com.entity.ShixinmingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 失信名单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public class ShixinmingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 预约失信次数
	 */
	
	private Integer yuyueshixincishu;
		
	/**
	 * 是否禁用
	 */
	
	private String shifoujinyong;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
	 * 设置：预约失信次数
	 */
	 
	public void setYuyueshixincishu(Integer yuyueshixincishu) {
		this.yuyueshixincishu = yuyueshixincishu;
	}
	
	/**
	 * 获取：预约失信次数
	 */
	public Integer getYuyueshixincishu() {
		return yuyueshixincishu;
	}
				
	
	/**
	 * 设置：是否禁用
	 */
	 
	public void setShifoujinyong(String shifoujinyong) {
		this.shifoujinyong = shifoujinyong;
	}
	
	/**
	 * 获取：是否禁用
	 */
	public String getShifoujinyong() {
		return shifoujinyong;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
