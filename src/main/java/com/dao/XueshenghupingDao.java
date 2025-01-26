package com.dao;

import com.entity.XueshenghupingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshenghupingVO;
import com.entity.view.XueshenghupingView;


/**
 * 学生互评
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface XueshenghupingDao extends BaseMapper<XueshenghupingEntity> {
	
	List<XueshenghupingVO> selectListVO(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
	
	XueshenghupingVO selectVO(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
	
	List<XueshenghupingView> selectListView(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);

	List<XueshenghupingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
	
	XueshenghupingView selectView(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
	

}
