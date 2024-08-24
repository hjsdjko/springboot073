package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YoupinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YoupinView;


/**
 * 油品
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface YoupinService extends IService<YoupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoupinView> selectListView(Wrapper<YoupinEntity> wrapper);
   	
   	YoupinView selectView(@Param("ew") Wrapper<YoupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoupinEntity> wrapper);
   	

}

