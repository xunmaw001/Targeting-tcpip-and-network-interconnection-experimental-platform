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

import com.entity.XueshengzuoyeEntity;
import com.entity.view.XueshengzuoyeView;

import com.service.XueshengzuoyeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 学生作业
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/xueshengzuoye")
public class XueshengzuoyeController {
    @Autowired
    private XueshengzuoyeService xueshengzuoyeService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengzuoyeEntity xueshengzuoye, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			xueshengzuoye.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xueshengzuoye.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengzuoyeEntity> ew = new EntityWrapper<XueshengzuoyeEntity>();


		PageUtils page = xueshengzuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengzuoye), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengzuoyeEntity xueshengzuoye, 
		HttpServletRequest request){
        EntityWrapper<XueshengzuoyeEntity> ew = new EntityWrapper<XueshengzuoyeEntity>();

		PageUtils page = xueshengzuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengzuoye), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengzuoyeEntity xueshengzuoye){
       	EntityWrapper<XueshengzuoyeEntity> ew = new EntityWrapper<XueshengzuoyeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengzuoye, "xueshengzuoye")); 
        return R.ok().put("data", xueshengzuoyeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengzuoyeEntity xueshengzuoye){
        EntityWrapper< XueshengzuoyeEntity> ew = new EntityWrapper< XueshengzuoyeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengzuoye, "xueshengzuoye")); 
		XueshengzuoyeView xueshengzuoyeView =  xueshengzuoyeService.selectView(ew);
		return R.ok("查询学生作业成功").put("data", xueshengzuoyeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengzuoyeEntity xueshengzuoye = xueshengzuoyeService.selectById(id);
        return R.ok().put("data", xueshengzuoye);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengzuoyeEntity xueshengzuoye = xueshengzuoyeService.selectById(id);
        return R.ok().put("data", xueshengzuoye);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengzuoyeEntity xueshengzuoye, HttpServletRequest request){
    	xueshengzuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengzuoye);

        xueshengzuoyeService.insert(xueshengzuoye);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody XueshengzuoyeEntity xueshengzuoye, HttpServletRequest request){
    	xueshengzuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengzuoye);

        xueshengzuoyeService.insert(xueshengzuoye);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengzuoyeEntity xueshengzuoye, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengzuoye);
        xueshengzuoyeService.updateById(xueshengzuoye);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengzuoyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
