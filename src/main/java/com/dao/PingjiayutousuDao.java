package com.dao;

import com.entity.PingjiayutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiayutousuVO;
import com.entity.view.PingjiayutousuView;


/**
 * 评价与投诉
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface PingjiayutousuDao extends BaseMapper<PingjiayutousuEntity> {
	
	List<PingjiayutousuVO> selectListVO(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
	
	PingjiayutousuVO selectVO(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
	
	List<PingjiayutousuView> selectListView(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);

	List<PingjiayutousuView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
	
	PingjiayutousuView selectView(@Param("ew") Wrapper<PingjiayutousuEntity> wrapper);
	
}
