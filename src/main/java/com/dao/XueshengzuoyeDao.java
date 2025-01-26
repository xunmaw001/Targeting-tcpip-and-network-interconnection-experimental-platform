package com.dao;

import com.entity.XueshengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengzuoyeVO;
import com.entity.view.XueshengzuoyeView;


/**
 * 学生作业
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface XueshengzuoyeDao extends BaseMapper<XueshengzuoyeEntity> {
	
	List<XueshengzuoyeVO> selectListVO(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
	
	XueshengzuoyeVO selectVO(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
	
	List<XueshengzuoyeView> selectListView(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);

	List<XueshengzuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
	
	XueshengzuoyeView selectView(@Param("ew") Wrapper<XueshengzuoyeEntity> wrapper);
	

}
