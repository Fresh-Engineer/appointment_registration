package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusszaixianwenzhenEntity;
import com.entity.view.DiscusszaixianwenzhenView;

import com.service.DiscusszaixianwenzhenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 在线问诊评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@RestController
@RequestMapping("/discusszaixianwenzhen")
public class DiscusszaixianwenzhenController {
    @Autowired
    private DiscusszaixianwenzhenService discusszaixianwenzhenService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusszaixianwenzhenEntity discusszaixianwenzhen, 
		HttpServletRequest request){

        EntityWrapper<DiscusszaixianwenzhenEntity> ew = new EntityWrapper<DiscusszaixianwenzhenEntity>();
		PageUtils page = discusszaixianwenzhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszaixianwenzhen), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusszaixianwenzhenEntity discusszaixianwenzhen, HttpServletRequest request){
        EntityWrapper<DiscusszaixianwenzhenEntity> ew = new EntityWrapper<DiscusszaixianwenzhenEntity>();
		PageUtils page = discusszaixianwenzhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusszaixianwenzhen), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusszaixianwenzhenEntity discusszaixianwenzhen){
       	EntityWrapper<DiscusszaixianwenzhenEntity> ew = new EntityWrapper<DiscusszaixianwenzhenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusszaixianwenzhen, "discusszaixianwenzhen")); 
        return R.ok().put("data", discusszaixianwenzhenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusszaixianwenzhenEntity discusszaixianwenzhen){
        EntityWrapper< DiscusszaixianwenzhenEntity> ew = new EntityWrapper< DiscusszaixianwenzhenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusszaixianwenzhen, "discusszaixianwenzhen")); 
		DiscusszaixianwenzhenView discusszaixianwenzhenView =  discusszaixianwenzhenService.selectView(ew);
		return R.ok("查询在线问诊评论表成功").put("data", discusszaixianwenzhenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusszaixianwenzhenEntity discusszaixianwenzhen = discusszaixianwenzhenService.selectById(id);
        return R.ok().put("data", discusszaixianwenzhen);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusszaixianwenzhenEntity discusszaixianwenzhen = discusszaixianwenzhenService.selectById(id);
        return R.ok().put("data", discusszaixianwenzhen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusszaixianwenzhenEntity discusszaixianwenzhen, HttpServletRequest request){
    	discusszaixianwenzhen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszaixianwenzhen);

        discusszaixianwenzhenService.insert(discusszaixianwenzhen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusszaixianwenzhenEntity discusszaixianwenzhen, HttpServletRequest request){
    	discusszaixianwenzhen.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusszaixianwenzhen);

        discusszaixianwenzhenService.insert(discusszaixianwenzhen);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusszaixianwenzhenEntity discusszaixianwenzhen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusszaixianwenzhen);
        discusszaixianwenzhenService.updateById(discusszaixianwenzhen);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusszaixianwenzhenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusszaixianwenzhenEntity> wrapper = new EntityWrapper<DiscusszaixianwenzhenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusszaixianwenzhenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
