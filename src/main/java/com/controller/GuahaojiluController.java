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

import com.utils.*;
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

import com.entity.GuahaojiluEntity;
import com.entity.view.GuahaojiluView;

import com.service.GuahaojiluService;
import com.service.TokenService;


/**
 * 挂号记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 22:20:39
 */
@RestController
@RequestMapping("/guahaojilu")
public class GuahaojiluController {
    @Autowired
    private GuahaojiluService guahaojiluService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuahaojiluEntity guahaojilu, 
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date yuyueshijianstart,
                @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date yuyueshijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			guahaojilu.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			guahaojilu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuahaojiluEntity> ew = new EntityWrapper<GuahaojiluEntity>();
                if(yuyueshijianstart!=null) ew.ge("yuyueshijian", yuyueshijianstart);
                if(yuyueshijianend!=null) ew.le("yuyueshijian", yuyueshijianend);
		PageUtils page = guahaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahaojilu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuahaojiluEntity guahaojilu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			guahaojilu.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			guahaojilu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuahaojiluEntity> ew = new EntityWrapper<GuahaojiluEntity>();
		PageUtils page = guahaojiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guahaojilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuahaojiluEntity guahaojilu){
       	EntityWrapper<GuahaojiluEntity> ew = new EntityWrapper<GuahaojiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guahaojilu, "guahaojilu")); 
        return R.ok().put("data", guahaojiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuahaojiluEntity guahaojilu){
        EntityWrapper< GuahaojiluEntity> ew = new EntityWrapper< GuahaojiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guahaojilu, "guahaojilu")); 
		GuahaojiluView guahaojiluView =  guahaojiluService.selectView(ew);
		return R.ok("查询挂号记录成功").put("data", guahaojiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuahaojiluEntity guahaojilu = guahaojiluService.selectById(id);
        return R.ok().put("data", guahaojilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuahaojiluEntity guahaojilu = guahaojiluService.selectById(id);
        return R.ok().put("data", guahaojilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuahaojiluEntity guahaojilu, HttpServletRequest request){
    	guahaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guahaojilu);
		RedisUtils redisUtils = new RedisUtils();
		redisUtils.set(guahaojilu.getId().toString(),guahaojilu.toString());
        guahaojiluService.insert(guahaojilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuahaojiluEntity guahaojilu, HttpServletRequest request){
    	guahaojilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guahaojilu);
    	guahaojilu.setUserid((Long)request.getSession().getAttribute("userId"));
		RedisUtils redisUtils = new RedisUtils();
		redisUtils.set(guahaojilu.getId().toString(),guahaojilu.toString());
        guahaojiluService.insert(guahaojilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GuahaojiluEntity guahaojilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guahaojilu);
        guahaojiluService.updateById(guahaojilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guahaojiluService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GuahaojiluEntity> wrapper = new EntityWrapper<GuahaojiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishenggonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = guahaojiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
