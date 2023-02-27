package com.dao;

import com.entity.GuahaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaojiluVO;
import com.entity.view.GuahaojiluView;


/**
 * 挂号记录
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface GuahaojiluDao extends BaseMapper<GuahaojiluEntity> {
	
	List<GuahaojiluVO> selectListVO(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
	
	GuahaojiluVO selectVO(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
	
	List<GuahaojiluView> selectListView(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);

	List<GuahaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
	
	GuahaojiluView selectView(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
	
}
