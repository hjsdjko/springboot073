package com.cl.dao;

import com.cl.entity.YoupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YoupinView;


/**
 * 油品
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface YoupinDao extends BaseMapper<YoupinEntity> {
	
	List<YoupinView> selectListView(@Param("ew") Wrapper<YoupinEntity> wrapper);

	List<YoupinView> selectListView(Pagination page,@Param("ew") Wrapper<YoupinEntity> wrapper);
	
	YoupinView selectView(@Param("ew") Wrapper<YoupinEntity> wrapper);
	

}
