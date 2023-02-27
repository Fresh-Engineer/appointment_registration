package com.dao;

import com.entity.ShixinmingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixinmingdanVO;
import com.entity.view.ShixinmingdanView;


/**
 * 失信名单
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface ShixinmingdanDao extends BaseMapper<ShixinmingdanEntity> {
	
	List<ShixinmingdanVO> selectListVO(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
	
	ShixinmingdanVO selectVO(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
	
	List<ShixinmingdanView> selectListView(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);

	List<ShixinmingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
	
	ShixinmingdanView selectView(@Param("ew") Wrapper<ShixinmingdanEntity> wrapper);
	
}
