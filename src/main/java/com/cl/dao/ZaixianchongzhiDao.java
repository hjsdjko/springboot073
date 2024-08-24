package com.cl.dao;

import com.cl.entity.ZaixianchongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZaixianchongzhiView;


/**
 * 在线充值
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface ZaixianchongzhiDao extends BaseMapper<ZaixianchongzhiEntity> {
	
	List<ZaixianchongzhiView> selectListView(@Param("ew") Wrapper<ZaixianchongzhiEntity> wrapper);

	List<ZaixianchongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianchongzhiEntity> wrapper);
	
	ZaixianchongzhiView selectView(@Param("ew") Wrapper<ZaixianchongzhiEntity> wrapper);
	

}
