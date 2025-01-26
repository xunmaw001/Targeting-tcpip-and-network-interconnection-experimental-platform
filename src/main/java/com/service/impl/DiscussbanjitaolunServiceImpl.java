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


import com.dao.DiscussbanjitaolunDao;
import com.entity.DiscussbanjitaolunEntity;
import com.service.DiscussbanjitaolunService;
import com.entity.vo.DiscussbanjitaolunVO;
import com.entity.view.DiscussbanjitaolunView;

@Service("discussbanjitaolunService")
public class DiscussbanjitaolunServiceImpl extends ServiceImpl<DiscussbanjitaolunDao, DiscussbanjitaolunEntity> implements DiscussbanjitaolunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanjitaolunEntity> page = this.selectPage(
                new Query<DiscussbanjitaolunEntity>(params).getPage(),
                new EntityWrapper<DiscussbanjitaolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanjitaolunEntity> wrapper) {
		  Page<DiscussbanjitaolunView> page =new Query<DiscussbanjitaolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanjitaolunVO> selectListVO(Wrapper<DiscussbanjitaolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanjitaolunVO selectVO(Wrapper<DiscussbanjitaolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanjitaolunView> selectListView(Wrapper<DiscussbanjitaolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanjitaolunView selectView(Wrapper<DiscussbanjitaolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
