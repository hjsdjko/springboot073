package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZaixianchongzhiEntity;
import com.cl.entity.view.ZaixianchongzhiView;

import com.cl.service.ZaixianchongzhiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 在线充值
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@RestController
@RequestMapping("/zaixianchongzhi")
public class ZaixianchongzhiController {
    @Autowired
    private ZaixianchongzhiService zaixianchongzhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixianchongzhiEntity zaixianchongzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zaixianchongzhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZaixianchongzhiEntity> ew = new EntityWrapper<ZaixianchongzhiEntity>();

		PageUtils page = zaixianchongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianchongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixianchongzhiEntity zaixianchongzhi, 
		HttpServletRequest request){
        EntityWrapper<ZaixianchongzhiEntity> ew = new EntityWrapper<ZaixianchongzhiEntity>();

		PageUtils page = zaixianchongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianchongzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixianchongzhiEntity zaixianchongzhi){
       	EntityWrapper<ZaixianchongzhiEntity> ew = new EntityWrapper<ZaixianchongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixianchongzhi, "zaixianchongzhi")); 
        return R.ok().put("data", zaixianchongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaixianchongzhiEntity zaixianchongzhi){
        EntityWrapper< ZaixianchongzhiEntity> ew = new EntityWrapper< ZaixianchongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixianchongzhi, "zaixianchongzhi")); 
		ZaixianchongzhiView zaixianchongzhiView =  zaixianchongzhiService.selectView(ew);
		return R.ok("查询在线充值成功").put("data", zaixianchongzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixianchongzhiEntity zaixianchongzhi = zaixianchongzhiService.selectById(id);
		zaixianchongzhi = zaixianchongzhiService.selectView(new EntityWrapper<ZaixianchongzhiEntity>().eq("id", id));
        return R.ok().put("data", zaixianchongzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixianchongzhiEntity zaixianchongzhi = zaixianchongzhiService.selectById(id);
		zaixianchongzhi = zaixianchongzhiService.selectView(new EntityWrapper<ZaixianchongzhiEntity>().eq("id", id));
        return R.ok().put("data", zaixianchongzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixianchongzhiEntity zaixianchongzhi, HttpServletRequest request){
    	zaixianchongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianchongzhi);
        zaixianchongzhiService.insert(zaixianchongzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaixianchongzhiEntity zaixianchongzhi, HttpServletRequest request){
    	zaixianchongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianchongzhi);
        zaixianchongzhiService.insert(zaixianchongzhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZaixianchongzhiEntity zaixianchongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixianchongzhi);
        zaixianchongzhiService.updateById(zaixianchongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixianchongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
