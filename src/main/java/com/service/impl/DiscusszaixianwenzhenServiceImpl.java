package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszaixianwenzhenDao;
import com.entity.DiscusszaixianwenzhenEntity;
import com.service.DiscusszaixianwenzhenService;
import com.entity.vo.DiscusszaixianwenzhenVO;
import com.entity.view.DiscusszaixianwenzhenView;

@Service("discusszaixianwenzhenService")
public class DiscusszaixianwenzhenServiceImpl extends ServiceImpl<DiscusszaixianwenzhenDao, DiscusszaixianwenzhenEntity> implements DiscusszaixianwenzhenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixianwenzhenEntity> page = this.selectPage(
                new Query<DiscusszaixianwenzhenEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixianwenzhenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixianwenzhenEntity> wrapper) {
		  Page<DiscusszaixianwenzhenView> page =new Query<DiscusszaixianwenzhenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixianwenzhenVO> selectListVO(Wrapper<DiscusszaixianwenzhenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixianwenzhenVO selectVO(Wrapper<DiscusszaixianwenzhenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixianwenzhenView> selectListView(Wrapper<DiscusszaixianwenzhenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixianwenzhenView selectView(Wrapper<DiscusszaixianwenzhenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
