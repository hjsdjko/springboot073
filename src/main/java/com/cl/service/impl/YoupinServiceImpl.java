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


import com.cl.dao.YoupinDao;
import com.cl.entity.YoupinEntity;
import com.cl.service.YoupinService;
import com.cl.entity.view.YoupinView;

@Service("youpinService")
public class YoupinServiceImpl extends ServiceImpl<YoupinDao, YoupinEntity> implements YoupinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoupinEntity> page = this.selectPage(
                new Query<YoupinEntity>(params).getPage(),
                new EntityWrapper<YoupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoupinEntity> wrapper) {
		  Page<YoupinView> page =new Query<YoupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YoupinView> selectListView(Wrapper<YoupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoupinView selectView(Wrapper<YoupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
