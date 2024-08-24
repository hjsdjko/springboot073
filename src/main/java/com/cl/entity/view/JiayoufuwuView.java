package com.cl.entity.view;

import com.cl.entity.JiayoufuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 加油服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@TableName("jiayoufuwu")
public class JiayoufuwuView  extends JiayoufuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiayoufuwuView(){
	}
 
 	public JiayoufuwuView(JiayoufuwuEntity jiayoufuwuEntity){
 	try {
			BeanUtils.copyProperties(this, jiayoufuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
