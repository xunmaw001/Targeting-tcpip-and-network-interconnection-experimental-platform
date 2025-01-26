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

import com.entity.XueshenghupingEntity;
import com.entity.view.XueshenghupingView;

import com.service.XueshenghupingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 学生互评
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/xueshenghuping")
public class XueshenghupingController {
    @Autowired
    private XueshenghupingService xueshenghupingService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshenghupingEntity xueshenghuping, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			xueshenghuping.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xueshenghuping.setHupingxuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshenghupingEntity> ew = new EntityWrapper<XueshenghupingEntity>();


		PageUtils page = xueshenghupingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenghuping), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshenghupingEntity xueshenghuping, 
		HttpServletRequest request){
        EntityWrapper<XueshenghupingEntity> ew = new EntityWrapper<XueshenghupingEntity>();

		PageUtils page = xueshenghupingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshenghuping), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshenghupingEntity xueshenghuping){
       	EntityWrapper<XueshenghupingEntity> ew = new EntityWrapper<XueshenghupingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshenghuping, "xueshenghuping")); 
        return R.ok().put("data", xueshenghupingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshenghupingEntity xueshenghuping){
        EntityWrapper< XueshenghupingEntity> ew = new EntityWrapper< XueshenghupingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshenghuping, "xueshenghuping")); 
		XueshenghupingView xueshenghupingView =  xueshenghupingService.selectView(ew);
		return R.ok("查询学生互评成功").put("data", xueshenghupingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshenghupingEntity xueshenghuping = xueshenghupingService.selectById(id);
        return R.ok().put("data", xueshenghuping);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshenghupingEntity xueshenghuping = xueshenghupingService.selectById(id);
        return R.ok().put("data", xueshenghuping);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshenghupingEntity xueshenghuping, HttpServletRequest request){
    	xueshenghuping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshenghuping);

        xueshenghupingService.insert(xueshenghuping);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshenghupingEntity xueshenghuping, HttpServletRequest request){
    	xueshenghuping.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshenghuping);

        xueshenghupingService.insert(xueshenghuping);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshenghupingEntity xueshenghuping, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshenghuping);
        xueshenghupingService.updateById(xueshenghuping);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshenghupingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
