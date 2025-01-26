package com.dao;

import com.entity.ShiyanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanxinxiVO;
import com.entity.view.ShiyanxinxiView;


/**
 * 实验信息
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyanxinxiDao extends BaseMapper<ShiyanxinxiEntity> {
	
	List<ShiyanxinxiVO> selectListVO(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
	
	ShiyanxinxiVO selectVO(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
	
	List<ShiyanxinxiView> selectListView(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);

	List<ShiyanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
	
	ShiyanxinxiView selectView(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
	

}
