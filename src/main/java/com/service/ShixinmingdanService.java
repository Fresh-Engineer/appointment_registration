package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixinmingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixinmingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixinmingdanView;


/**
 * 失信名单
 *
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface ShixinmingdanService extends IService<ShixinmingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixinmingdanVO> selectListVO(Wrapper<ShixinmingdanEntity> wrapper);
   	
   	ShixinmingdanVO selectVO(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
   	
   	List<ShixinmingdanView> selectListView(Wrapper<ShixinmingdanEntity> wrapper);
   	
   	ShixinmingdanView selectView(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixinmingdanEntity> wrapper);
   	
}

