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


import com.dao.ShixinmingdanDao;
import com.entity.ShixinmingdanEntity;
import com.service.ShixinmingdanService;
import com.entity.vo.ShixinmingdanVO;
import com.entity.view.ShixinmingdanView;

@Service("shixinmingdanService")
public class ShixinmingdanServiceImpl extends ServiceImpl<ShixinmingdanDao, ShixinmingdanEntity> implements ShixinmingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixinmingdanEntity> page = this.selectPage(
                new Query<ShixinmingdanEntity>(params).getPage(),
                new EntityWrapper<ShixinmingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixinmingdanEntity> wrapper) {
		  Page<ShixinmingdanView> page =new Query<ShixinmingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixinmingdanVO> selectListVO(Wrapper<ShixinmingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixinmingdanVO selectVO(Wrapper<ShixinmingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixinmingdanView> selectListView(Wrapper<ShixinmingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixinmingdanView selectView(Wrapper<ShixinmingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
