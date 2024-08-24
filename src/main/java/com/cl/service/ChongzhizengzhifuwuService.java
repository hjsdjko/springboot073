package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongzhizengzhifuwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongzhizengzhifuwuView;


/**
 * 充值增值服务
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface ChongzhizengzhifuwuService extends IService<ChongzhizengzhifuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongzhizengzhifuwuView> selectListView(Wrapper<ChongzhizengzhifuwuEntity> wrapper);
   	
   	ChongzhizengzhifuwuView selectView(@Param("ew") Wrapper<ChongzhizengzhifuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongzhizengzhifuwuEntity> wrapper);
   	

}

