package com.dao;

import com.entity.JigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JigouVO;
import com.entity.view.JigouView;


/**
 * 机构
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface JigouDao extends BaseMapper<JigouEntity> {
	
	List<JigouVO> selectListVO(@Param("ew") Wrapper<JigouEntity> wrapper);
	
	JigouVO selectVO(@Param("ew") Wrapper<JigouEntity> wrapper);
	
	List<JigouView> selectListView(@Param("ew") Wrapper<JigouEntity> wrapper);

	List<JigouView> selectListView(Pagination page,@Param("ew") Wrapper<JigouEntity> wrapper);
	
	JigouView selectView(@Param("ew") Wrapper<JigouEntity> wrapper);
	
}
