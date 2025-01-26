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

import com.entity.BanjixinxiEntity;
import com.entity.view.BanjixinxiView;

import com.service.BanjixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 班级信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/banjixinxi")
public class BanjixinxiController {
    @Autowired
    private BanjixinxiService banjixinxiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjixinxiEntity banjixinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			banjixinxi.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjixinxiEntity> ew = new EntityWrapper<BanjixinxiEntity>();


		PageUtils page = banjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjixinxiEntity banjixinxi, 
		HttpServletRequest request){
        EntityWrapper<BanjixinxiEntity> ew = new EntityWrapper<BanjixinxiEntity>();

		PageUtils page = banjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjixinxiEntity banjixinxi){
       	EntityWrapper<BanjixinxiEntity> ew = new EntityWrapper<BanjixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjixinxi, "banjixinxi")); 
        return R.ok().put("data", banjixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjixinxiEntity banjixinxi){
        EntityWrapper< BanjixinxiEntity> ew = new EntityWrapper< BanjixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjixinxi, "banjixinxi")); 
		BanjixinxiView banjixinxiView =  banjixinxiService.selectView(ew);
		return R.ok("查询班级信息成功").put("data", banjixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjixinxiEntity banjixinxi = banjixinxiService.selectById(id);
        return R.ok().put("data", banjixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjixinxiEntity banjixinxi = banjixinxiService.selectById(id);
        return R.ok().put("data", banjixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjixinxiEntity banjixinxi, HttpServletRequest request){
    	banjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjixinxi);

        banjixinxiService.insert(banjixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjixinxiEntity banjixinxi, HttpServletRequest request){
    	banjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjixinxi);

        banjixinxiService.insert(banjixinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjixinxiEntity banjixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjixinxi);
        banjixinxiService.updateById(banjixinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
