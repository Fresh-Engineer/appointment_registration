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


import com.dao.PingjiayutousuDao;
import com.entity.PingjiayutousuEntity;
import com.service.PingjiayutousuService;
import com.entity.vo.PingjiayutousuVO;
import com.entity.view.PingjiayutousuView;

@Service("pingjiayutousuService")
public class PingjiayutousuServiceImpl extends ServiceImpl<PingjiayutousuDao, PingjiayutousuEntity> implements PingjiayutousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiayutousuEntity> page = this.selectPage(
                new Query<PingjiayutousuEntity>(params).getPage(),
                new EntityWrapper<PingjiayutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiayutousuEntity> wrapper) {
		  Page<PingjiayutousuView> page =new Query<PingjiayutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiayutousuVO> selectListVO(Wrapper<PingjiayutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiayutousuVO selectVO(Wrapper<PingjiayutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiayutousuView> selectListView(Wrapper<PingjiayutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiayutousuView selectView(Wrapper<PingjiayutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
