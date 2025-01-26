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


import com.dao.ShiyanchengjiDao;
import com.entity.ShiyanchengjiEntity;
import com.service.ShiyanchengjiService;
import com.entity.vo.ShiyanchengjiVO;
import com.entity.view.ShiyanchengjiView;

@Service("shiyanchengjiService")
public class ShiyanchengjiServiceImpl extends ServiceImpl<ShiyanchengjiDao, ShiyanchengjiEntity> implements ShiyanchengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanchengjiEntity> page = this.selectPage(
                new Query<ShiyanchengjiEntity>(params).getPage(),
                new EntityWrapper<ShiyanchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanchengjiEntity> wrapper) {
		  Page<ShiyanchengjiView> page =new Query<ShiyanchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanchengjiVO> selectListVO(Wrapper<ShiyanchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanchengjiVO selectVO(Wrapper<ShiyanchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanchengjiView> selectListView(Wrapper<ShiyanchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanchengjiView selectView(Wrapper<ShiyanchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
