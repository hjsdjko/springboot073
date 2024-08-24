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


import com.cl.dao.JiayoufuwuDao;
import com.cl.entity.JiayoufuwuEntity;
import com.cl.service.JiayoufuwuService;
import com.cl.entity.view.JiayoufuwuView;

@Service("jiayoufuwuService")
public class JiayoufuwuServiceImpl extends ServiceImpl<JiayoufuwuDao, JiayoufuwuEntity> implements JiayoufuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiayoufuwuEntity> page = this.selectPage(
                new Query<JiayoufuwuEntity>(params).getPage(),
                new EntityWrapper<JiayoufuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiayoufuwuEntity> wrapper) {
		  Page<JiayoufuwuView> page =new Query<JiayoufuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiayoufuwuView> selectListView(Wrapper<JiayoufuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiayoufuwuView selectView(Wrapper<JiayoufuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
