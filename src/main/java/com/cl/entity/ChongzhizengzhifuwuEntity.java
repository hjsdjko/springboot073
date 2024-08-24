package com.cl.entity;

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
 * 充值增值服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@TableName("chongzhizengzhifuwu")
public class ChongzhizengzhifuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongzhizengzhifuwuEntity() {
		
	}
	
	public ChongzhizengzhifuwuEntity(T t) {
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
	 * 服务名称
	 */
					
	private String fuwumingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 充值金额
	 */
					
	private Integer chongzhijine;
	
	/**
	 * 赠送金额
	 */
					
	private Integer zengsongjine;
	
	/**
	 * 充值须知
	 */
					
	private String chongzhixuzhi;
	
	
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
	 * 设置：服务名称
	 */
	public void setFuwumingcheng(String fuwumingcheng) {
		this.fuwumingcheng = fuwumingcheng;
	}
	/**
	 * 获取：服务名称
	 */
	public String getFuwumingcheng() {
		return fuwumingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：充值金额
	 */
	public void setChongzhijine(Integer chongzhijine) {
		this.chongzhijine = chongzhijine;
	}
	/**
	 * 获取：充值金额
	 */
	public Integer getChongzhijine() {
		return chongzhijine;
	}
	/**
	 * 设置：赠送金额
	 */
	public void setZengsongjine(Integer zengsongjine) {
		this.zengsongjine = zengsongjine;
	}
	/**
	 * 获取：赠送金额
	 */
	public Integer getZengsongjine() {
		return zengsongjine;
	}
	/**
	 * 设置：充值须知
	 */
	public void setChongzhixuzhi(String chongzhixuzhi) {
		this.chongzhixuzhi = chongzhixuzhi;
	}
	/**
	 * 获取：充值须知
	 */
	public String getChongzhixuzhi() {
		return chongzhixuzhi;
	}

}
