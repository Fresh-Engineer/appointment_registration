package com.dao;

import com.entity.QuxiaoguahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaoguahaoVO;
import com.entity.view.QuxiaoguahaoView;


/**
 * 取消挂号
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface QuxiaoguahaoDao extends BaseMapper<QuxiaoguahaoEntity> {
	
	List<QuxiaoguahaoVO> selectListVO(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
	
	QuxiaoguahaoVO selectVO(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
	
	List<QuxiaoguahaoView> selectListView(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);

	List<QuxiaoguahaoView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
	
	QuxiaoguahaoView selectView(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
	
}
