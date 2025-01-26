package com.dao;

import com.entity.BaogaozhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaogaozhanshiVO;
import com.entity.view.BaogaozhanshiView;


/**
 * 报告展示
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface BaogaozhanshiDao extends BaseMapper<BaogaozhanshiEntity> {
	
	List<BaogaozhanshiVO> selectListVO(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
	
	BaogaozhanshiVO selectVO(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
	
	List<BaogaozhanshiView> selectListView(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);

	List<BaogaozhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
	
	BaogaozhanshiView selectView(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
	

}
