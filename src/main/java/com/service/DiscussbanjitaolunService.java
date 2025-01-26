package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbanjitaolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbanjitaolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbanjitaolunView;


/**
 * 班级讨论评论表
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:50
 */
public interface DiscussbanjitaolunService extends IService<DiscussbanjitaolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbanjitaolunVO> selectListVO(Wrapper<DiscussbanjitaolunEntity> wrapper);
   	
   	DiscussbanjitaolunVO selectVO(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
   	
   	List<DiscussbanjitaolunView> selectListView(Wrapper<DiscussbanjitaolunEntity> wrapper);
   	
   	DiscussbanjitaolunView selectView(@Param("ew") Wrapper<DiscussbanjitaolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbanjitaolunEntity> wrapper);
   	

}

