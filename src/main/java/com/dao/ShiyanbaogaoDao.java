package com.dao;

import com.entity.ShiyanbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanbaogaoVO;
import com.entity.view.ShiyanbaogaoView;


/**
 * 实验报告
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyanbaogaoDao extends BaseMapper<ShiyanbaogaoEntity> {
	
	List<ShiyanbaogaoVO> selectListVO(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	
	ShiyanbaogaoVO selectVO(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	
	List<ShiyanbaogaoView> selectListView(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);

	List<ShiyanbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	
	ShiyanbaogaoView selectView(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	

}
