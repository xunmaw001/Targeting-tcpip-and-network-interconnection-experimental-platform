package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyancuijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyancuijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyancuijiaoView;


/**
 * 实验催缴
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyancuijiaoService extends IService<ShiyancuijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyancuijiaoVO> selectListVO(Wrapper<ShiyancuijiaoEntity> wrapper);
   	
   	ShiyancuijiaoVO selectVO(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
   	
   	List<ShiyancuijiaoView> selectListView(Wrapper<ShiyancuijiaoEntity> wrapper);
   	
   	ShiyancuijiaoView selectView(@Param("ew") Wrapper<ShiyancuijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyancuijiaoEntity> wrapper);
   	

}

