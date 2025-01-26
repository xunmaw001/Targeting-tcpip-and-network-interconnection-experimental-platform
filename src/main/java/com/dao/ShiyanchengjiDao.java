package com.dao;

import com.entity.ShiyanchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanchengjiVO;
import com.entity.view.ShiyanchengjiView;


/**
 * 实验成绩
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyanchengjiDao extends BaseMapper<ShiyanchengjiEntity> {
	
	List<ShiyanchengjiVO> selectListVO(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
	
	ShiyanchengjiVO selectVO(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
	
	List<ShiyanchengjiView> selectListView(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);

	List<ShiyanchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
	
	ShiyanchengjiView selectView(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
	

}
