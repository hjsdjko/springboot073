package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiayoufuwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiayoufuwuView;


/**
 * 加油服务
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface JiayoufuwuService extends IService<JiayoufuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiayoufuwuView> selectListView(Wrapper<JiayoufuwuEntity> wrapper);
   	
   	JiayoufuwuView selectView(@Param("ew") Wrapper<JiayoufuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiayoufuwuEntity> wrapper);
   	

}

