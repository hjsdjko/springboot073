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
 * 订单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@TableName("dingdanxinxi")
public class DingdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanxinxiEntity() {
		
	}
	
	public DingdanxinxiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 油枪名称
	 */
					
	private String youqiangmingcheng;
	
	/**
	 * 油品
	 */
					
	private String youpin;
	
	/**
	 * 单价
	 */
					
	private Double danjia;
	
	/**
	 * 加油量
	 */
					
	private Double kucun;
	
	/**
	 * 应付金额
	 */
					
	private String yingfujine;
	
	/**
	 * 是否开发票
	 */
					
	private String shifoukaifapiao;
	
	/**
	 * 下单时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiadanshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：加油量
	 */
	public void setKucun(Double kucun) {
		this.kucun = kucun;
	}
	/**
	 * 获取：加油量
	 */
	public Double getKucun() {
		return kucun;
	}
	/**
	 * 设置：应付金额
	 */
	public void setYingfujine(String yingfujine) {
		this.yingfujine = yingfujine;
	}
	/**
	 * 获取：应付金额
	 */
	public String getYingfujine() {
		return yingfujine;
	}
	/**
	 * 设置：是否开发票
	 */
	public void setShifoukaifapiao(String shifoukaifapiao) {
		this.shifoukaifapiao = shifoukaifapiao;
	}
	/**
	 * 获取：是否开发票
	 */
	public String getShifoukaifapiao() {
		return shifoukaifapiao;
	}
	/**
	 * 设置：下单时间
	 */
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
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
