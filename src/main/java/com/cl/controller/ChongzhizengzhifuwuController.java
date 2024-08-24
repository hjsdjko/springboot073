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

import com.cl.entity.ChongzhizengzhifuwuEntity;
import com.cl.entity.view.ChongzhizengzhifuwuView;

import com.cl.service.ChongzhizengzhifuwuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 充值增值服务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-07 21:20:21
 */
@RestController
@RequestMapping("/chongzhizengzhifuwu")
public class ChongzhizengzhifuwuController {
    @Autowired
    private ChongzhizengzhifuwuService chongzhizengzhifuwuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongzhizengzhifuwuEntity chongzhizengzhifuwu,
		HttpServletRequest request){
        EntityWrapper<ChongzhizengzhifuwuEntity> ew = new EntityWrapper<ChongzhizengzhifuwuEntity>();

		PageUtils page = chongzhizengzhifuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongzhizengzhifuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongzhizengzhifuwuEntity chongzhizengzhifuwu, 
		HttpServletRequest request){
        EntityWrapper<ChongzhizengzhifuwuEntity> ew = new EntityWrapper<ChongzhizengzhifuwuEntity>();

		PageUtils page = chongzhizengzhifuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongzhizengzhifuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongzhizengzhifuwuEntity chongzhizengzhifuwu){
       	EntityWrapper<ChongzhizengzhifuwuEntity> ew = new EntityWrapper<ChongzhizengzhifuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongzhizengzhifuwu, "chongzhizengzhifuwu")); 
        return R.ok().put("data", chongzhizengzhifuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongzhizengzhifuwuEntity chongzhizengzhifuwu){
        EntityWrapper< ChongzhizengzhifuwuEntity> ew = new EntityWrapper< ChongzhizengzhifuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongzhizengzhifuwu, "chongzhizengzhifuwu")); 
		ChongzhizengzhifuwuView chongzhizengzhifuwuView =  chongzhizengzhifuwuService.selectView(ew);
		return R.ok("查询充值增值服务成功").put("data", chongzhizengzhifuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongzhizengzhifuwuEntity chongzhizengzhifuwu = chongzhizengzhifuwuService.selectById(id);
		chongzhizengzhifuwu = chongzhizengzhifuwuService.selectView(new EntityWrapper<ChongzhizengzhifuwuEntity>().eq("id", id));
        return R.ok().put("data", chongzhizengzhifuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongzhizengzhifuwuEntity chongzhizengzhifuwu = chongzhizengzhifuwuService.selectById(id);
		chongzhizengzhifuwu = chongzhizengzhifuwuService.selectView(new EntityWrapper<ChongzhizengzhifuwuEntity>().eq("id", id));
        return R.ok().put("data", chongzhizengzhifuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongzhizengzhifuwuEntity chongzhizengzhifuwu, HttpServletRequest request){
    	chongzhizengzhifuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongzhizengzhifuwu);
        chongzhizengzhifuwuService.insert(chongzhizengzhifuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongzhizengzhifuwuEntity chongzhizengzhifuwu, HttpServletRequest request){
    	chongzhizengzhifuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongzhizengzhifuwu);
        chongzhizengzhifuwuService.insert(chongzhizengzhifuwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongzhizengzhifuwuEntity chongzhizengzhifuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongzhizengzhifuwu);
        chongzhizengzhifuwuService.updateById(chongzhizengzhifuwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongzhizengzhifuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
