package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanchengjiView;


/**
 * 实验成绩
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ShiyanchengjiService extends IService<ShiyanchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanchengjiVO> selectListVO(Wrapper<ShiyanchengjiEntity> wrapper);
   	
   	ShiyanchengjiVO selectVO(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
   	
   	List<ShiyanchengjiView> selectListView(Wrapper<ShiyanchengjiEntity> wrapper);
   	
   	ShiyanchengjiView selectView(@Param("ew") Wrapper<ShiyanchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanchengjiEntity> wrapper);
   	

}

