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

import com.entity.BanjitaolunEntity;
import com.entity.view.BanjitaolunView;

import com.service.BanjitaolunService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 班级讨论
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
@RestController
@RequestMapping("/banjitaolun")
public class BanjitaolunController {
    @Autowired
    private BanjitaolunService banjitaolunService;



    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjitaolunEntity banjitaolun, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoshi")) {
			banjitaolun.setLaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjitaolunEntity> ew = new EntityWrapper<BanjitaolunEntity>();


		PageUtils page = banjitaolunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjitaolun), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjitaolunEntity banjitaolun, 
		HttpServletRequest request){
        EntityWrapper<BanjitaolunEntity> ew = new EntityWrapper<BanjitaolunEntity>();

		PageUtils page = banjitaolunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjitaolun), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjitaolunEntity banjitaolun){
       	EntityWrapper<BanjitaolunEntity> ew = new EntityWrapper<BanjitaolunEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjitaolun, "banjitaolun")); 
        return R.ok().put("data", banjitaolunService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjitaolunEntity banjitaolun){
        EntityWrapper< BanjitaolunEntity> ew = new EntityWrapper< BanjitaolunEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjitaolun, "banjitaolun")); 
		BanjitaolunView banjitaolunView =  banjitaolunService.selectView(ew);
		return R.ok("查询班级讨论成功").put("data", banjitaolunView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjitaolunEntity banjitaolun = banjitaolunService.selectById(id);
		banjitaolun.setClicknum(banjitaolun.getClicknum()+1);
		banjitaolun.setClicktime(new Date());
		banjitaolunService.updateById(banjitaolun);
        return R.ok().put("data", banjitaolun);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjitaolunEntity banjitaolun = banjitaolunService.selectById(id);
		banjitaolun.setClicknum(banjitaolun.getClicknum()+1);
		banjitaolun.setClicktime(new Date());
		banjitaolunService.updateById(banjitaolun);
        return R.ok().put("data", banjitaolun);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        BanjitaolunEntity banjitaolun = banjitaolunService.selectById(id);
        if(type.equals("1")) {
        	banjitaolun.setThumbsupnum(banjitaolun.getThumbsupnum()+1);
        } else {
        	banjitaolun.setCrazilynum(banjitaolun.getCrazilynum()+1);
        }
        banjitaolunService.updateById(banjitaolun);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjitaolunEntity banjitaolun, HttpServletRequest request){
    	banjitaolun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjitaolun);

        banjitaolunService.insert(banjitaolun);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody BanjitaolunEntity banjitaolun, HttpServletRequest request){
    	banjitaolun.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjitaolun);

        banjitaolunService.insert(banjitaolun);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjitaolunEntity banjitaolun, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjitaolun);
        banjitaolunService.updateById(banjitaolun);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjitaolunService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,BanjitaolunEntity banjitaolun, HttpServletRequest request,String pre){
        EntityWrapper<BanjitaolunEntity> ew = new EntityWrapper<BanjitaolunEntity>();
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
		PageUtils page = banjitaolunService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjitaolun), params), params));
        return R.ok().put("data", page);
    }









}
