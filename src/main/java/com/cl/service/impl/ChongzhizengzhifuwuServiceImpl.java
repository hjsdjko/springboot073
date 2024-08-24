package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ChongzhizengzhifuwuDao;
import com.cl.entity.ChongzhizengzhifuwuEntity;
import com.cl.service.ChongzhizengzhifuwuService;
import com.cl.entity.view.ChongzhizengzhifuwuView;

@Service("chongzhizengzhifuwuService")
public class ChongzhizengzhifuwuServiceImpl extends ServiceImpl<ChongzhizengzhifuwuDao, ChongzhizengzhifuwuEntity> implements ChongzhizengzhifuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongzhizengzhifuwuEntity> page = this.selectPage(
                new Query<ChongzhizengzhifuwuEntity>(params).getPage(),
                new EntityWrapper<ChongzhizengzhifuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongzhizengzhifuwuEntity> wrapper) {
		  Page<ChongzhizengzhifuwuView> page =new Query<ChongzhizengzhifuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongzhizengzhifuwuView> selectListView(Wrapper<ChongzhizengzhifuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongzhizengzhifuwuView selectView(Wrapper<ChongzhizengzhifuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
