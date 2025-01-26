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


import com.dao.BanjitaolunDao;
import com.entity.BanjitaolunEntity;
import com.service.BanjitaolunService;
import com.entity.vo.BanjitaolunVO;
import com.entity.view.BanjitaolunView;

@Service("banjitaolunService")
public class BanjitaolunServiceImpl extends ServiceImpl<BanjitaolunDao, BanjitaolunEntity> implements BanjitaolunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjitaolunEntity> page = this.selectPage(
                new Query<BanjitaolunEntity>(params).getPage(),
                new EntityWrapper<BanjitaolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjitaolunEntity> wrapper) {
		  Page<BanjitaolunView> page =new Query<BanjitaolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjitaolunVO> selectListVO(Wrapper<BanjitaolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjitaolunVO selectVO(Wrapper<BanjitaolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjitaolunView> selectListView(Wrapper<BanjitaolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjitaolunView selectView(Wrapper<BanjitaolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
