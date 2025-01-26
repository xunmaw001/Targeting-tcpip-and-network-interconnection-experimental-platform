package com.controller;

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
import java.io.IOException;

import com.utils.ValidatorUtils;
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
import com.annotation.IgnoreAuth;

import com.entity.ShiyanchengjiEntity;
import com.entity.view.ShiyanchengjiView;

import com.service.ShiyanchengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 实验成绩
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/shiyanchengji")
public class ShiyanchengjiController {
    @Autowired
    private ShiyanchengjiService shiyanchengjiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanchengjiEntity shiyanchengji, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shiyanchengji.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("laoshi")) {
			shiyanchengji.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanchengjiEntity> ew = new EntityWrapper<ShiyanchengjiEntity>();


		PageUtils page = shiyanchengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanchengji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanchengjiEntity shiyanchengji, 
		HttpServletRequest request){
        EntityWrapper<ShiyanchengjiEntity> ew = new EntityWrapper<ShiyanchengjiEntity>();

		PageUtils page = shiyanchengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanchengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanchengjiEntity shiyanchengji){
       	EntityWrapper<ShiyanchengjiEntity> ew = new EntityWrapper<ShiyanchengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanchengji, "shiyanchengji")); 
        return R.ok().put("data", shiyanchengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanchengjiEntity shiyanchengji){
        EntityWrapper< ShiyanchengjiEntity> ew = new EntityWrapper< ShiyanchengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanchengji, "shiyanchengji")); 
		ShiyanchengjiView shiyanchengjiView =  shiyanchengjiService.selectView(ew);
		return R.ok("查询实验成绩成功").put("data", shiyanchengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanchengjiEntity shiyanchengji = shiyanchengjiService.selectById(id);
        return R.ok().put("data", shiyanchengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanchengjiEntity shiyanchengji = shiyanchengjiService.selectById(id);
        return R.ok().put("data", shiyanchengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanchengjiEntity shiyanchengji, HttpServletRequest request){
    	shiyanchengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanchengji);

        shiyanchengjiService.insert(shiyanchengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanchengjiEntity shiyanchengji, HttpServletRequest request){
    	shiyanchengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanchengji);

        shiyanchengjiService.insert(shiyanchengji);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanchengjiEntity shiyanchengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanchengji);
        shiyanchengjiService.updateById(shiyanchengji);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanchengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
