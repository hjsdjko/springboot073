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


import com.cl.dao.DingdanxinxiDao;
import com.cl.entity.DingdanxinxiEntity;
import com.cl.service.DingdanxinxiService;
import com.cl.entity.view.DingdanxinxiView;

@Service("dingdanxinxiService")
public class DingdanxinxiServiceImpl extends ServiceImpl<DingdanxinxiDao, DingdanxinxiEntity> implements DingdanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanxinxiEntity> page = this.selectPage(
                new Query<DingdanxinxiEntity>(params).getPage(),
                new EntityWrapper<DingdanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanxinxiEntity> wrapper) {
		  Page<DingdanxinxiView> page =new Query<DingdanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DingdanxinxiView> selectListView(Wrapper<DingdanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanxinxiView selectView(Wrapper<DingdanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
