package com.cl.entity.view;

import com.cl.entity.YoupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 油品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@TableName("youpin")
public class YoupinView  extends YoupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YoupinView(){
	}
 
 	public YoupinView(YoupinEntity youpinEntity){
 	try {
			BeanUtils.copyProperties(this, youpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
