package com.entity.model;

import com.entity.ShouhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 收货信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-28 13:59:12
 */
public class ShouhuoxinxiModel  implements Serializable {
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
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 物流状态
	 */
	
	private String wuliuzhuangtai;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 发货时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fahuoshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：物流状态
	 */
	 
	public void setWuliuzhuangtai(String wuliuzhuangtai) {
		this.wuliuzhuangtai = wuliuzhuangtai;
	}
	
	/**
	 * 获取：物流状态
	 */
	public String getWuliuzhuangtai() {
		return wuliuzhuangtai;
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
	 * 设置：发货时间
	 */
	 
	public void setFahuoshijian(Date fahuoshijian) {
		this.fahuoshijian = fahuoshijian;
	}
	
	/**
	 * 获取：发货时间
	 */
	public Date getFahuoshijian() {
		return fahuoshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
