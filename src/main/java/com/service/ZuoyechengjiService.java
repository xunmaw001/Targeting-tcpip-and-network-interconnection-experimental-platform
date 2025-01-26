package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyechengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyechengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyechengjiView;


/**
 * 作业成绩
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface ZuoyechengjiService extends IService<ZuoyechengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyechengjiVO> selectListVO(Wrapper<ZuoyechengjiEntity> wrapper);
   	
   	ZuoyechengjiVO selectVO(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);
   	
   	List<ZuoyechengjiView> selectListView(Wrapper<ZuoyechengjiEntity> wrapper);
   	
   	ZuoyechengjiView selectView(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyechengjiEntity> wrapper);
   	

}

