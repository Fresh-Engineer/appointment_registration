package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JigouView;


/**
 * 机构
 *
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface JigouService extends IService<JigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JigouVO> selectListVO(Wrapper<JigouEntity> wrapper);
   	
   	JigouVO selectVO(@Param("ew") Wrapper<JigouEntity> wrapper);
   	
   	List<JigouView> selectListView(Wrapper<JigouEntity> wrapper);
   	
   	JigouView selectView(@Param("ew") Wrapper<JigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JigouEntity> wrapper);
   	
}

