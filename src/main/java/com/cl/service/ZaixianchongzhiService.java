package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZaixianchongzhiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZaixianchongzhiView;


/**
 * 在线充值
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface ZaixianchongzhiService extends IService<ZaixianchongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianchongzhiView> selectListView(Wrapper<ZaixianchongzhiEntity> wrapper);
   	
   	ZaixianchongzhiView selectView(@Param("ew") Wrapper<ZaixianchongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianchongzhiEntity> wrapper);
   	

}

