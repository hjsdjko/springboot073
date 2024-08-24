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
 * 加油服务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@TableName("jiayoufuwu")
public class JiayoufuwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiayoufuwuEntity() {
		
	}
	
	public JiayoufuwuEntity(T t) {
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
	 * 油枪名称
	 */
					
	private String youqiangmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 油品
	 */
					
	private String youpin;
	
	/**
	 * 单价
	 */
					
	private Double danjia;
	
	/**
	 * 库存
	 */
					
	private Double kucun;
	
	/**
	 * 油枪位置
	 */
					
	private String youqiangweizhi;
	
	
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
	 * 设置：油枪名称
	 */
	public void setYouqiangmingcheng(String youqiangmingcheng) {
		this.youqiangmingcheng = youqiangmingcheng;
	}
	/**
	 * 获取：油枪名称
	 */
	public String getYouqiangmingcheng() {
		return youqiangmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：油品
	 */
	public void setYoupin(String youpin) {
		this.youpin = youpin;
	}
	/**
	 * 获取：油品
	 */
	public String getYoupin() {
		return youpin;
	}
	/**
	 * 设置：单价
	 */
	public void setDanjia(Double danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Double getDanjia() {
		return danjia;
	}
	/**
	 * 设置：库存
	 */
	public void setKucun(Double kucun) {
		this.kucun = kucun;
	}
	/**
	 * 获取：库存
	 */
	public Double getKucun() {
		return kucun;
	}
	/**
	 * 设置：油枪位置
	 */
	public void setYouqiangweizhi(String youqiangweizhi) {
		this.youqiangweizhi = youqiangweizhi;
	}
	/**
	 * 获取：油枪位置
	 */
	public String getYouqiangweizhi() {
		return youqiangweizhi;
	}

}
