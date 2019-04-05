package com.cskaoyan.controller;

import com.cskaoyan.bean.*;
import com.cskaoyan.service.TechnologyPlanService;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Controller
@RequestMapping("technologyPlan")
public class TechnologyPlanController {

    @Autowired
    TechnologyPlanService technologyPlanService;

    @Autowired
    TechnologyService technologyService;

    @RequestMapping("*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    //查询所有的plan数据
    @RequestMapping("find")
    public String find() {
        return "technologyPlan_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<TechnologyPlan> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<TechnologyPlan> technologyPlans = technologyPlanService.queryAllTechnologyPlan(page, rows);
        return technologyPlans;
    }

    @RequestMapping("search_technologyPlan_by_technologyPlanId")
    @ResponseBody
    public List<TechnologyPlan> search_technologyPlan_by_technologyPlanId(@RequestParam("searchValue") String searchValue,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<TechnologyPlan> technologyPlans = technologyPlanService.searchTechnologyPlanByTechnologyPlanId(searchValue, page, rows);
        return technologyPlans;
    }

    @RequestMapping("search_technologyPlan_by_technologyName")
    @ResponseBody
    public Tip2<TechnologyPlan> search_technologyPlan_by_technologyName(@RequestParam("searchValue") String searchValue, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        Tip2<TechnologyPlan> technologyPlanTip2 = new Tip2<>();
        int count = technologyPlanService.countByTechnologyName(searchValue);
        List<TechnologyPlan> technologyPlans = technologyPlanService.searchTechnologyRequirementByTechnologyName(searchValue, page, rows);
        technologyPlanTip2.setTotal(count);
        technologyPlanTip2.setRows(technologyPlans);
        return technologyPlanTip2;
    }

    //增加一条工艺计划信息
    @RequestMapping("add")
    public String add(){
        return "technologyPlan_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(TechnologyPlan technologyPlan) {
        boolean addTechnologyPlan = technologyPlanService.addTechnologyPlan(technologyPlan);
        if (addTechnologyPlan){
            return new Tip("200","新增工艺计划成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    //修改工艺要求信息
    @RequestMapping("edit")
    public String edit(){
        return "technologyPlan_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(TechnologyPlan technologyPlan){
        boolean editTechnologyPlan = technologyPlanService.editTechnologyPlan(technologyPlan);
        if (editTechnologyPlan){
            return new Tip("200","修改工艺计划成功",null);
        }
        return new Tip("0","修改失败",null);
    }

    //批量删除工艺要求信息
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids){
        boolean deleteTechnologyPlan = technologyPlanService.deleteBatchTechnologyPlan(ids);
        if (deleteTechnologyPlan){
            return new Tip("200","删除工艺计划成功",null);
        }
        return new Tip("0","删除失败",null);
    }

}
