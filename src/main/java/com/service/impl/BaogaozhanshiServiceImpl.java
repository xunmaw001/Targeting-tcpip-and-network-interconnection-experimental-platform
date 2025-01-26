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


import com.dao.BaogaozhanshiDao;
import com.entity.BaogaozhanshiEntity;
import com.service.BaogaozhanshiService;
import com.entity.vo.BaogaozhanshiVO;
import com.entity.view.BaogaozhanshiView;

@Service("baogaozhanshiService")
public class BaogaozhanshiServiceImpl extends ServiceImpl<BaogaozhanshiDao, BaogaozhanshiEntity> implements BaogaozhanshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaogaozhanshiEntity> page = this.selectPage(
                new Query<BaogaozhanshiEntity>(params).getPage(),
                new EntityWrapper<BaogaozhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaogaozhanshiEntity> wrapper) {
		  Page<BaogaozhanshiView> page =new Query<BaogaozhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaogaozhanshiVO> selectListVO(Wrapper<BaogaozhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaogaozhanshiVO selectVO(Wrapper<BaogaozhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaogaozhanshiView> selectListView(Wrapper<BaogaozhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaogaozhanshiView selectView(Wrapper<BaogaozhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
