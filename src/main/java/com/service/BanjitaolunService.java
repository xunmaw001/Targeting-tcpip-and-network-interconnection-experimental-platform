package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjitaolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjitaolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjitaolunView;


/**
 * 班级讨论
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface BanjitaolunService extends IService<BanjitaolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjitaolunVO> selectListVO(Wrapper<BanjitaolunEntity> wrapper);
   	
   	BanjitaolunVO selectVO(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
   	
   	List<BanjitaolunView> selectListView(Wrapper<BanjitaolunEntity> wrapper);
   	
   	BanjitaolunView selectView(@Param("ew") Wrapper<BanjitaolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjitaolunEntity> wrapper);
   	

}

