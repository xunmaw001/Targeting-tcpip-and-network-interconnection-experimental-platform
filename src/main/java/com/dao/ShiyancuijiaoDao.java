package com.dao;

import com.entity.ShiyancuijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyancuijiaoVO;
import com.entity.view.ShiyancuijiaoView;


/**
 * 实验催缴
 * 
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyancuijiaoDao extends BaseMapper<ShiyancuijiaoEntity> {
	
	List<ShiyancuijiaoVO> selectListVO(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
	
	ShiyancuijiaoVO selectVO(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
	
	List<ShiyancuijiaoView> selectListView(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);

	List<ShiyancuijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
	
	ShiyancuijiaoView selectView(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
	

}
