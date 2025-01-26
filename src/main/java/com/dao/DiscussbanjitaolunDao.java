package com.dao;

import com.entity.DiscussbanjitaolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbanjitaolunVO;
import com.entity.view.DiscussbanjitaolunView;


/**
 * 班级讨论评论表
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:50
 */
public interface DiscussbanjitaolunDao extends BaseMapper<DiscussbanjitaolunEntity> {
	
	List<DiscussbanjitaolunVO> selectListVO(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
	
	DiscussbanjitaolunVO selectVO(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
	
	List<DiscussbanjitaolunView> selectListView(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);

	List<DiscussbanjitaolunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
	
	DiscussbanjitaolunView selectView(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
	

}
