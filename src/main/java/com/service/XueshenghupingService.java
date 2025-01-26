package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshenghupingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshenghupingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshenghupingView;


/**
 * 学生互评
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface XueshenghupingService extends IService<XueshenghupingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshenghupingVO> selectListVO(Wrapper<XueshenghupingEntity> wrapper);
   	
   	XueshenghupingVO selectVO(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
   	
   	List<XueshenghupingView> selectListView(Wrapper<XueshenghupingEntity> wrapper);
   	
   	XueshenghupingView selectView(@Param("ew") Wrapper<XueshenghupingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshenghupingEntity> wrapper);
   	

}

