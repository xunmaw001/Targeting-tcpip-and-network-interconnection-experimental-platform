package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaogaozhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaogaozhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaogaozhanshiView;


/**
 * 报告展示
 *
 * @author 
 * @email 
 * @date 2023-05-14 12:08:49
 */
public interface BaogaozhanshiService extends IService<BaogaozhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaogaozhanshiVO> selectListVO(Wrapper<BaogaozhanshiEntity> wrapper);
   	
   	BaogaozhanshiVO selectVO(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
   	
   	List<BaogaozhanshiView> selectListView(Wrapper<BaogaozhanshiEntity> wrapper);
   	
   	BaogaozhanshiView selectView(@Param("ew") Wrapper<BaogaozhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaogaozhanshiEntity> wrapper);
   	

}

