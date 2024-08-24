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

import com.cl.entity.YoupinEntity;
import com.cl.entity.view.YoupinView;

import com.cl.service.YoupinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 油品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@RestController
@RequestMapping("/youpin")
public class YoupinController {
    @Autowired
    private YoupinService youpinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YoupinEntity youpin,
		HttpServletRequest request){
        EntityWrapper<YoupinEntity> ew = new EntityWrapper<YoupinEntity>();

		PageUtils page = youpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YoupinEntity youpin, 
		HttpServletRequest request){
        EntityWrapper<YoupinEntity> ew = new EntityWrapper<YoupinEntity>();

		PageUtils page = youpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YoupinEntity youpin){
       	EntityWrapper<YoupinEntity> ew = new EntityWrapper<YoupinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youpin, "youpin")); 
        return R.ok().put("data", youpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YoupinEntity youpin){
        EntityWrapper< YoupinEntity> ew = new EntityWrapper< YoupinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youpin, "youpin")); 
		YoupinView youpinView =  youpinService.selectView(ew);
		return R.ok("查询油品成功").put("data", youpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YoupinEntity youpin = youpinService.selectById(id);
		youpin = youpinService.selectView(new EntityWrapper<YoupinEntity>().eq("id", id));
        return R.ok().put("data", youpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YoupinEntity youpin = youpinService.selectById(id);
		youpin = youpinService.selectView(new EntityWrapper<YoupinEntity>().eq("id", id));
        return R.ok().put("data", youpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YoupinEntity youpin, HttpServletRequest request){
    	youpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youpin);
        youpinService.insert(youpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YoupinEntity youpin, HttpServletRequest request){
    	youpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youpin);
        youpinService.insert(youpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YoupinEntity youpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youpin);
        youpinService.updateById(youpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
