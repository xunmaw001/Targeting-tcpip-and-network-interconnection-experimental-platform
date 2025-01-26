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

import com.entity.DiscussbanjitaolunEntity;
import com.entity.view.DiscussbanjitaolunView;

import com.service.DiscussbanjitaolunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 班级讨论评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:50
 */
@RestController
@RequestMapping("/discussbanjitaolun")
public class DiscussbanjitaolunController {
    @Autowired
    private DiscussbanjitaolunService discussbanjitaolunService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussbanjitaolunEntity discussbanjitaolun, 
		HttpServletRequest request){

        EntityWrapper<DiscussbanjitaolunEntity> ew = new EntityWrapper<DiscussbanjitaolunEntity>();


		PageUtils page = discussbanjitaolunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussbanjitaolun), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussbanjitaolunEntity discussbanjitaolun, 
		HttpServletRequest request){
        EntityWrapper<DiscussbanjitaolunEntity> ew = new EntityWrapper<DiscussbanjitaolunEntity>();

		PageUtils page = discussbanjitaolunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussbanjitaolun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussbanjitaolunEntity discussbanjitaolun){
       	EntityWrapper<DiscussbanjitaolunEntity> ew = new EntityWrapper<DiscussbanjitaolunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussbanjitaolun, "discussbanjitaolun")); 
        return R.ok().put("data", discussbanjitaolunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussbanjitaolunEntity discussbanjitaolun){
        EntityWrapper< DiscussbanjitaolunEntity> ew = new EntityWrapper< DiscussbanjitaolunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussbanjitaolun, "discussbanjitaolun")); 
		DiscussbanjitaolunView discussbanjitaolunView =  discussbanjitaolunService.selectView(ew);
		return R.ok("查询班级讨论评论表成功").put("data", discussbanjitaolunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussbanjitaolunEntity discussbanjitaolun = discussbanjitaolunService.selectById(id);
        return R.ok().put("data", discussbanjitaolun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussbanjitaolunEntity discussbanjitaolun = discussbanjitaolunService.selectById(id);
        return R.ok().put("data", discussbanjitaolun);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussbanjitaolunEntity discussbanjitaolun, HttpServletRequest request){
    	discussbanjitaolun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussbanjitaolun);

        discussbanjitaolunService.insert(discussbanjitaolun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussbanjitaolunEntity discussbanjitaolun, HttpServletRequest request){
    	discussbanjitaolun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussbanjitaolun);

        discussbanjitaolunService.insert(discussbanjitaolun);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussbanjitaolunEntity discussbanjitaolun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussbanjitaolun);
        discussbanjitaolunService.updateById(discussbanjitaolun);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussbanjitaolunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
