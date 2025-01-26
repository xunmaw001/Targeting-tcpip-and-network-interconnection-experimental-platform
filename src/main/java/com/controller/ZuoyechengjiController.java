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

import com.entity.ZuoyechengjiEntity;
import com.entity.view.ZuoyechengjiView;

import com.service.ZuoyechengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 作业成绩
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/zuoyechengji")
public class ZuoyechengjiController {
    @Autowired
    private ZuoyechengjiService zuoyechengjiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuoyechengjiEntity zuoyechengji, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			zuoyechengji.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			zuoyechengji.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuoyechengjiEntity> ew = new EntityWrapper<ZuoyechengjiEntity>();


		PageUtils page = zuoyechengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyechengji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuoyechengjiEntity zuoyechengji, 
		HttpServletRequest request){
        EntityWrapper<ZuoyechengjiEntity> ew = new EntityWrapper<ZuoyechengjiEntity>();

		PageUtils page = zuoyechengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyechengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuoyechengjiEntity zuoyechengji){
       	EntityWrapper<ZuoyechengjiEntity> ew = new EntityWrapper<ZuoyechengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuoyechengji, "zuoyechengji")); 
        return R.ok().put("data", zuoyechengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyechengjiEntity zuoyechengji){
        EntityWrapper< ZuoyechengjiEntity> ew = new EntityWrapper< ZuoyechengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuoyechengji, "zuoyechengji")); 
		ZuoyechengjiView zuoyechengjiView =  zuoyechengjiService.selectView(ew);
		return R.ok("查询作业成绩成功").put("data", zuoyechengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuoyechengjiEntity zuoyechengji = zuoyechengjiService.selectById(id);
        return R.ok().put("data", zuoyechengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuoyechengjiEntity zuoyechengji = zuoyechengjiService.selectById(id);
        return R.ok().put("data", zuoyechengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyechengjiEntity zuoyechengji, HttpServletRequest request){
    	zuoyechengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyechengji);

        zuoyechengjiService.insert(zuoyechengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyechengjiEntity zuoyechengji, HttpServletRequest request){
    	zuoyechengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyechengji);

        zuoyechengjiService.insert(zuoyechengji);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuoyechengjiEntity zuoyechengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuoyechengji);
        zuoyechengjiService.updateById(zuoyechengji);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuoyechengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
