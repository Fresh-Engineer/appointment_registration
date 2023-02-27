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

import com.entity.ShixinmingdanEntity;
import com.entity.view.ShixinmingdanView;

import com.service.ShixinmingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 失信名单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@RestController
@RequestMapping("/shixinmingdan")
public class ShixinmingdanController {
    @Autowired
    private ShixinmingdanService shixinmingdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShixinmingdanEntity shixinmingdan, 
		HttpServletRequest request){

        EntityWrapper<ShixinmingdanEntity> ew = new EntityWrapper<ShixinmingdanEntity>();
		PageUtils page = shixinmingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixinmingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShixinmingdanEntity shixinmingdan, HttpServletRequest request){
        EntityWrapper<ShixinmingdanEntity> ew = new EntityWrapper<ShixinmingdanEntity>();
		PageUtils page = shixinmingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixinmingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShixinmingdanEntity shixinmingdan){
       	EntityWrapper<ShixinmingdanEntity> ew = new EntityWrapper<ShixinmingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shixinmingdan, "shixinmingdan")); 
        return R.ok().put("data", shixinmingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShixinmingdanEntity shixinmingdan){
        EntityWrapper< ShixinmingdanEntity> ew = new EntityWrapper< ShixinmingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shixinmingdan, "shixinmingdan")); 
		ShixinmingdanView shixinmingdanView =  shixinmingdanService.selectView(ew);
		return R.ok("查询失信名单成功").put("data", shixinmingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShixinmingdanEntity shixinmingdan = shixinmingdanService.selectById(id);
        return R.ok().put("data", shixinmingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShixinmingdanEntity shixinmingdan = shixinmingdanService.selectById(id);
        return R.ok().put("data", shixinmingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShixinmingdanEntity shixinmingdan, HttpServletRequest request){
    	shixinmingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixinmingdan);

        shixinmingdanService.insert(shixinmingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShixinmingdanEntity shixinmingdan, HttpServletRequest request){
    	shixinmingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixinmingdan);

        shixinmingdanService.insert(shixinmingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShixinmingdanEntity shixinmingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shixinmingdan);
        shixinmingdanService.updateById(shixinmingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shixinmingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShixinmingdanEntity> wrapper = new EntityWrapper<ShixinmingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shixinmingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
