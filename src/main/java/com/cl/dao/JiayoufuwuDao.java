package com.cl.dao;

import com.cl.entity.JiayoufuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiayoufuwuView;


/**
 * 加油服务
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface JiayoufuwuDao extends BaseMapper<JiayoufuwuEntity> {
	
	List<JiayoufuwuView> selectListView(@Param("ew") Wrapper<JiayoufuwuEntity> wrapper);

	List<JiayoufuwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiayoufuwuEntity> wrapper);
	
	JiayoufuwuView selectView(@Param("ew") Wrapper<JiayoufuwuEntity> wrapper);
	

}
