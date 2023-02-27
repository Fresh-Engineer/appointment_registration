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


import com.dao.JigouDao;
import com.entity.JigouEntity;
import com.service.JigouService;
import com.entity.vo.JigouVO;
import com.entity.view.JigouView;

@Service("jigouService")
public class JigouServiceImpl extends ServiceImpl<JigouDao, JigouEntity> implements JigouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JigouEntity> page = this.selectPage(
                new Query<JigouEntity>(params).getPage(),
                new EntityWrapper<JigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JigouEntity> wrapper) {
		  Page<JigouView> page =new Query<JigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JigouVO> selectListVO(Wrapper<JigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JigouVO selectVO(Wrapper<JigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JigouView> selectListView(Wrapper<JigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JigouView selectView(Wrapper<JigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
