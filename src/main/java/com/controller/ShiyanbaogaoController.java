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

import com.entity.ShiyanbaogaoEntity;
import com.entity.view.ShiyanbaogaoView;

import com.service.ShiyanbaogaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 实验报告
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/shiyanbaogao")
public class ShiyanbaogaoController {
    @Autowired
    private ShiyanbaogaoService shiyanbaogaoService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanbaogaoEntity shiyanbaogao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			shiyanbaogao.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shiyanbaogao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanbaogaoEntity> ew = new EntityWrapper<ShiyanbaogaoEntity>();


		PageUtils page = shiyanbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanbaogao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanbaogaoEntity shiyanbaogao, 
		HttpServletRequest request){
        EntityWrapper<ShiyanbaogaoEntity> ew = new EntityWrapper<ShiyanbaogaoEntity>();

		PageUtils page = shiyanbaogaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanbaogao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanbaogaoEntity shiyanbaogao){
       	EntityWrapper<ShiyanbaogaoEntity> ew = new EntityWrapper<ShiyanbaogaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanbaogao, "shiyanbaogao")); 
        return R.ok().put("data", shiyanbaogaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanbaogaoEntity shiyanbaogao){
        EntityWrapper< ShiyanbaogaoEntity> ew = new EntityWrapper< ShiyanbaogaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanbaogao, "shiyanbaogao")); 
		ShiyanbaogaoView shiyanbaogaoView =  shiyanbaogaoService.selectView(ew);
		return R.ok("查询实验报告成功").put("data", shiyanbaogaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanbaogaoEntity shiyanbaogao = shiyanbaogaoService.selectById(id);
        return R.ok().put("data", shiyanbaogao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanbaogaoEntity shiyanbaogao = shiyanbaogaoService.selectById(id);
        return R.ok().put("data", shiyanbaogao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanbaogaoEntity shiyanbaogao, HttpServletRequest request){
    	shiyanbaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanbaogao);

        shiyanbaogaoService.insert(shiyanbaogao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanbaogaoEntity shiyanbaogao, HttpServletRequest request){
    	shiyanbaogao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanbaogao);

        shiyanbaogaoService.insert(shiyanbaogao);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanbaogaoEntity shiyanbaogao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanbaogao);
        shiyanbaogaoService.updateById(shiyanbaogao);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanbaogaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
