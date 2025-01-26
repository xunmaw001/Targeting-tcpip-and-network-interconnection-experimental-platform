package com.dao;

import com.entity.BanjitaolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjitaolunVO;
import com.entity.view.BanjitaolunView;


/**
 * 班级讨论
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface BanjitaolunDao extends BaseMapper<BanjitaolunEntity> {
	
	List<BanjitaolunVO> selectListVO(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
	
	BanjitaolunVO selectVO(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
	
	List<BanjitaolunView> selectListView(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);

	List<BanjitaolunView> selectListView(Pagination page,@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
	
	BanjitaolunView selectView(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
	

}
