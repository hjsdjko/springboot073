package com.cl.dao;

import com.cl.entity.ChongzhizengzhifuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongzhizengzhifuwuView;


/**
 * 充值增值服务
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
public interface ChongzhizengzhifuwuDao extends BaseMapper<ChongzhizengzhifuwuEntity> {
	
	List<ChongzhizengzhifuwuView> selectListView(@Param("ew") Wrapper<ChongzhizengzhifuwuEntity> wrapper);

	List<ChongzhizengzhifuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongzhizengzhifuwuEntity> wrapper);
	
	ChongzhizengzhifuwuView selectView(@Param("ew") Wrapper<ChongzhizengzhifuwuEntity> wrapper);
	

}
