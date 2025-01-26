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

import com.entity.BaogaozhanshiEntity;
import com.entity.view.BaogaozhanshiView;

import com.service.BaogaozhanshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 报告展示
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/baogaozhanshi")
public class BaogaozhanshiController {
    @Autowired
    private BaogaozhanshiService baogaozhanshiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaogaozhanshiEntity baogaozhanshi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			baogaozhanshi.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaogaozhanshiEntity> ew = new EntityWrapper<BaogaozhanshiEntity>();


		PageUtils page = baogaozhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaozhanshi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaogaozhanshiEntity baogaozhanshi, 
		HttpServletRequest request){
        EntityWrapper<BaogaozhanshiEntity> ew = new EntityWrapper<BaogaozhanshiEntity>();

		PageUtils page = baogaozhanshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baogaozhanshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaogaozhanshiEntity baogaozhanshi){
       	EntityWrapper<BaogaozhanshiEntity> ew = new EntityWrapper<BaogaozhanshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baogaozhanshi, "baogaozhanshi")); 
        return R.ok().put("data", baogaozhanshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaogaozhanshiEntity baogaozhanshi){
        EntityWrapper< BaogaozhanshiEntity> ew = new EntityWrapper< BaogaozhanshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baogaozhanshi, "baogaozhanshi")); 
		BaogaozhanshiView baogaozhanshiView =  baogaozhanshiService.selectView(ew);
		return R.ok("查询报告展示成功").put("data", baogaozhanshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaogaozhanshiEntity baogaozhanshi = baogaozhanshiService.selectById(id);
        return R.ok().put("data", baogaozhanshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaogaozhanshiEntity baogaozhanshi = baogaozhanshiService.selectById(id);
        return R.ok().put("data", baogaozhanshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaogaozhanshiEntity baogaozhanshi, HttpServletRequest request){
    	baogaozhanshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baogaozhanshi);

        baogaozhanshiService.insert(baogaozhanshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody BaogaozhanshiEntity baogaozhanshi, HttpServletRequest request){
    	baogaozhanshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baogaozhanshi);

        baogaozhanshiService.insert(baogaozhanshi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaogaozhanshiEntity baogaozhanshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baogaozhanshi);
        baogaozhanshiService.updateById(baogaozhanshi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baogaozhanshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
