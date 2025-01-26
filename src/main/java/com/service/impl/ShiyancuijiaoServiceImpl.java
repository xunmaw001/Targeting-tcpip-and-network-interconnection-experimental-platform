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


import com.dao.ShiyancuijiaoDao;
import com.entity.ShiyancuijiaoEntity;
import com.service.ShiyancuijiaoService;
import com.entity.vo.ShiyancuijiaoVO;
import com.entity.view.ShiyancuijiaoView;

@Service("shiyancuijiaoService")
public class ShiyancuijiaoServiceImpl extends ServiceImpl<ShiyancuijiaoDao, ShiyancuijiaoEntity> implements ShiyancuijiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyancuijiaoEntity> page = this.selectPage(
                new Query<ShiyancuijiaoEntity>(params).getPage(),
                new EntityWrapper<ShiyancuijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyancuijiaoEntity> wrapper) {
		  Page<ShiyancuijiaoView> page =new Query<ShiyancuijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyancuijiaoVO> selectListVO(Wrapper<ShiyancuijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyancuijiaoVO selectVO(Wrapper<ShiyancuijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyancuijiaoView> selectListView(Wrapper<ShiyancuijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyancuijiaoView selectView(Wrapper<ShiyancuijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
