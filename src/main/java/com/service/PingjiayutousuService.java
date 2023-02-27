package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingjiayutousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingjiayutousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingjiayutousuView;


/**
 * 评价与投诉
 *
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface PingjiayutousuService extends IService<PingjiayutousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiayutousuVO> selectListVO(Wrapper<PingjiayutousuEntity> wrapper);
   	
   	PingjiayutousuVO selectVO(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
   	
   	List<PingjiayutousuView> selectListView(Wrapper<PingjiayutousuEntity> wrapper);
   	
   	PingjiayutousuView selectView(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiayutousuEntity> wrapper);
   	
}

