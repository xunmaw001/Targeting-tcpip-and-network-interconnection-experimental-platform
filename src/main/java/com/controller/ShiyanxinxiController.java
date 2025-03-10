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

import com.entity.ShiyanxinxiEntity;
import com.entity.view.ShiyanxinxiView;

import com.service.ShiyanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 实验信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/shiyanxinxi")
public class ShiyanxinxiController {
    @Autowired
    private ShiyanxinxiService shiyanxinxiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanxinxiEntity shiyanxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			shiyanxinxi.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanxinxiEntity> ew = new EntityWrapper<ShiyanxinxiEntity>();


		PageUtils page = shiyanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanxinxiEntity shiyanxinxi, 
		HttpServletRequest request){
        EntityWrapper<ShiyanxinxiEntity> ew = new EntityWrapper<ShiyanxinxiEntity>();

		PageUtils page = shiyanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanxinxiEntity shiyanxinxi){
       	EntityWrapper<ShiyanxinxiEntity> ew = new EntityWrapper<ShiyanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanxinxi, "shiyanxinxi")); 
        return R.ok().put("data", shiyanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanxinxiEntity shiyanxinxi){
        EntityWrapper< ShiyanxinxiEntity> ew = new EntityWrapper< ShiyanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanxinxi, "shiyanxinxi")); 
		ShiyanxinxiView shiyanxinxiView =  shiyanxinxiService.selectView(ew);
		return R.ok("查询实验信息成功").put("data", shiyanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanxinxiEntity shiyanxinxi = shiyanxinxiService.selectById(id);
		shiyanxinxi.setClicknum(shiyanxinxi.getClicknum()+1);
		shiyanxinxi.setClicktime(new Date());
		shiyanxinxiService.updateById(shiyanxinxi);
        return R.ok().put("data", shiyanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanxinxiEntity shiyanxinxi = shiyanxinxiService.selectById(id);
		shiyanxinxi.setClicknum(shiyanxinxi.getClicknum()+1);
		shiyanxinxi.setClicktime(new Date());
		shiyanxinxiService.updateById(shiyanxinxi);
        return R.ok().put("data", shiyanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanxinxiEntity shiyanxinxi, HttpServletRequest request){
    	shiyanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanxinxi);

        shiyanxinxiService.insert(shiyanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanxinxiEntity shiyanxinxi, HttpServletRequest request){
    	shiyanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanxinxi);

        shiyanxinxiService.insert(shiyanxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanxinxiEntity shiyanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanxinxi);
        shiyanxinxiService.updateById(shiyanxinxi);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShiyanxinxiEntity shiyanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<ShiyanxinxiEntity> ew = new EntityWrapper<ShiyanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = shiyanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanxinxi), params), params));
        return R.ok().put("data", page);
    }









}
