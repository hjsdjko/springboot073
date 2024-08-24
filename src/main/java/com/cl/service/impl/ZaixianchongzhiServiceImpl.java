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


import com.cl.dao.ZaixianchongzhiDao;
import com.cl.entity.ZaixianchongzhiEntity;
import com.cl.service.ZaixianchongzhiService;
import com.cl.entity.view.ZaixianchongzhiView;

@Service("zaixianchongzhiService")
public class ZaixianchongzhiServiceImpl extends ServiceImpl<ZaixianchongzhiDao, ZaixianchongzhiEntity> implements ZaixianchongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianchongzhiEntity> page = this.selectPage(
                new Query<ZaixianchongzhiEntity>(params).getPage(),
                new EntityWrapper<ZaixianchongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianchongzhiEntity> wrapper) {
		  Page<ZaixianchongzhiView> page =new Query<ZaixianchongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZaixianchongzhiView> selectListView(Wrapper<ZaixianchongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianchongzhiView selectView(Wrapper<ZaixianchongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
