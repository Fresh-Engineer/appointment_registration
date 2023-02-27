package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixianwenzhenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixianwenzhenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixianwenzhenView;


/**
 * 在线问诊评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface DiscusszaixianwenzhenService extends IService<DiscusszaixianwenzhenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixianwenzhenVO> selectListVO(Wrapper<DiscusszaixianwenzhenEntity> wrapper);
   	
   	DiscusszaixianwenzhenVO selectVO(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
   	
   	List<DiscusszaixianwenzhenView> selectListView(Wrapper<DiscusszaixianwenzhenEntity> wrapper);
   	
   	DiscusszaixianwenzhenView selectView(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixianwenzhenEntity> wrapper);
   	
}

