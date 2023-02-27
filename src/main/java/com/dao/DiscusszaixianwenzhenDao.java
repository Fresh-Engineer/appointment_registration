package com.dao;

import com.entity.DiscusszaixianwenzhenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixianwenzhenVO;
import com.entity.view.DiscusszaixianwenzhenView;


/**
 * 在线问诊评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
public interface DiscusszaixianwenzhenDao extends BaseMapper<DiscusszaixianwenzhenEntity> {
	
	List<DiscusszaixianwenzhenVO> selectListVO(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
	
	DiscusszaixianwenzhenVO selectVO(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
	
	List<DiscusszaixianwenzhenView> selectListView(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);

	List<DiscusszaixianwenzhenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
	
	DiscusszaixianwenzhenView selectView(@Param("ew") Wrapper<DiscusszaixianwenzhenEntity> wrapper);
	
}
