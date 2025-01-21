package com.entity.vo;

import com.entity.DaojuguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 道具归还
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public class DaojuguihaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 道具名称
	 */
	
	private String daojumingcheng;
		
	/**
	 * 道具类型
	 */
	
	private String daojuleixing;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 租赁天数
	 */
	
	private String zulintianshu;
		
	/**
	 * 租赁时间
	 */
	
	private String zulinshijian;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 归还证明
	 */
	
	private String guihaizhengming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：道具名称
	 */
	 
	public void setDaojumingcheng(String daojumingcheng) {
		this.daojumingcheng = daojumingcheng;
	}
	
	/**
	 * 获取：道具名称
	 */
	public String getDaojumingcheng() {
		return daojumingcheng;
	}
				
	
	/**
	 * 设置：道具类型
	 */
	 
	public void setDaojuleixing(String daojuleixing) {
		this.daojuleixing = daojuleixing;
	}
	
	/**
	 * 获取：道具类型
	 */
	public String getDaojuleixing() {
		return daojuleixing;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：租赁天数
	 */
	 
	public void setZulintianshu(String zulintianshu) {
		this.zulintianshu = zulintianshu;
	}
	
	/**
	 * 获取：租赁天数
	 */
	public String getZulintianshu() {
		return zulintianshu;
	}
				
	
	/**
	 * 设置：租赁时间
	 */
	 
	public void setZulinshijian(String zulinshijian) {
		this.zulinshijian = zulinshijian;
	}
	
	/**
	 * 获取：租赁时间
	 */
	public String getZulinshijian() {
		return zulinshijian;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：归还证明
	 */
	 
	public void setGuihaizhengming(String guihaizhengming) {
		this.guihaizhengming = guihaizhengming;
	}
	
	/**
	 * 获取：归还证明
	 */
	public String getGuihaizhengming() {
		return guihaizhengming;
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
