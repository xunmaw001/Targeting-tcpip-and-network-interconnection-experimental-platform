package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshenghupingDao;
import com.entity.XueshenghupingEntity;
import com.service.XueshenghupingService;
import com.entity.vo.XueshenghupingVO;
import com.entity.view.XueshenghupingView;

@Service("xueshenghupingService")
public class XueshenghupingServiceImpl extends ServiceImpl<XueshenghupingDao, XueshenghupingEntity> implements XueshenghupingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshenghupingEntity> page = this.selectPage(
                new Query<XueshenghupingEntity>(params).getPage(),
                new EntityWrapper<XueshenghupingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshenghupingEntity> wrapper) {
		  Page<XueshenghupingView> page =new Query<XueshenghupingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshenghupingVO> selectListVO(Wrapper<XueshenghupingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshenghupingVO selectVO(Wrapper<XueshenghupingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshenghupingView> selectListView(Wrapper<XueshenghupingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshenghupingView selectView(Wrapper<XueshenghupingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
