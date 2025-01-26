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

import com.entity.ShiyancuijiaoEntity;
import com.entity.view.ShiyancuijiaoView;

import com.service.ShiyancuijiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 实验催缴
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/shiyancuijiao")
public class ShiyancuijiaoController {
    @Autowired
    private ShiyancuijiaoService shiyancuijiaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyancuijiaoEntity shiyancuijiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shiyancuijiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("laoshi")) {
			shiyancuijiao.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyancuijiaoEntity> ew = new EntityWrapper<ShiyancuijiaoEntity>();


		PageUtils page = shiyancuijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyancuijiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyancuijiaoEntity shiyancuijiao, 
		HttpServletRequest request){
        EntityWrapper<ShiyancuijiaoEntity> ew = new EntityWrapper<ShiyancuijiaoEntity>();

		PageUtils page = shiyancuijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyancuijiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyancuijiaoEntity shiyancuijiao){
       	EntityWrapper<ShiyancuijiaoEntity> ew = new EntityWrapper<ShiyancuijiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyancuijiao, "shiyancuijiao")); 
        return R.ok().put("data", shiyancuijiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyancuijiaoEntity shiyancuijiao){
        EntityWrapper< ShiyancuijiaoEntity> ew = new EntityWrapper< ShiyancuijiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyancuijiao, "shiyancuijiao")); 
		ShiyancuijiaoView shiyancuijiaoView =  shiyancuijiaoService.selectView(ew);
		return R.ok("查询实验催缴成功").put("data", shiyancuijiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyancuijiaoEntity shiyancuijiao = shiyancuijiaoService.selectById(id);
        return R.ok().put("data", shiyancuijiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyancuijiaoEntity shiyancuijiao = shiyancuijiaoService.selectById(id);
        return R.ok().put("data", shiyancuijiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyancuijiaoEntity shiyancuijiao, HttpServletRequest request){
    	shiyancuijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyancuijiao);

        shiyancuijiaoService.insert(shiyancuijiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShiyancuijiaoEntity shiyancuijiao, HttpServletRequest request){
    	shiyancuijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyancuijiao);

        shiyancuijiaoService.insert(shiyancuijiao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyancuijiaoEntity shiyancuijiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyancuijiao);
        shiyancuijiaoService.updateById(shiyancuijiao);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyancuijiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
