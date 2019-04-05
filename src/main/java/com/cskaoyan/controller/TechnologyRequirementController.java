package com.cskaoyan.controller;


import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Tip2;
import com.cskaoyan.service.TechnologyRequirementService;
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
@RequestMapping("technologyRequirement")
public class TechnologyRequirementController {

    @Autowired
    TechnologyRequirementService technologyRequirementService;

    @Autowired
    TechnologyService technologyService;

    @RequestMapping("*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    @RequestMapping("find")
    public String find() {
        return "technologyRequirement_list";
    }

    /**
     * 查询所有的数据
     */
    @RequestMapping("list")
    @ResponseBody
    public List<TechnologyRequirement> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        List<TechnologyRequirement> technologyRequirements = technologyRequirementService.queryAllTechnologyRequirement(page, rows);
        return technologyRequirements;
    }

    //按照工艺要求编号查询
    @RequestMapping("search_technologyRequirement_by_technologyRequirementId")
    @ResponseBody
    public List<TechnologyRequirement> search_technologyRequirement_by_technologyRequirementId(@RequestParam("searchValue") String searchValue,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<TechnologyRequirement> technologyRequirements = technologyRequirementService.searchTechnologyRequirementByTechnologyRequirementId(searchValue, page, rows);
        return technologyRequirements;
    }

    //按照工艺名称查询
    @RequestMapping("search_technologyRequirement_by_technologyName")
    @ResponseBody
    public Tip2<TechnologyRequirement> search_technologyRequirement_by_technologyName(@RequestParam("searchValue") String searchValue, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        Tip2<TechnologyRequirement> requirementTip2 = new Tip2<>();
        int count = technologyRequirementService.countByTechnologyName(searchValue);
        List<TechnologyRequirement> technologyRequirements = technologyRequirementService.searchTechnologyRequirementByTechnologyName(searchValue, page, rows);
        requirementTip2.setTotal(count);
        requirementTip2.setRows(technologyRequirements);
        return requirementTip2;
    }

    //增加一条工艺要求信息
    @RequestMapping("add")
    public String add(){
        return "technologyRequirement_add";
    }

   @RequestMapping("insert")
    @ResponseBody
    public Tip insert(TechnologyRequirement technologyRequirement) {
        boolean addTechnologyRequirement = technologyRequirementService.addTechnologyRequirement(technologyRequirement);
        if (addTechnologyRequirement){
            return new Tip("200","新增工艺要求成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    //修改工艺要求信息
    @RequestMapping("edit")
    public String edit(){
        return "technologyRequirement_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(TechnologyRequirement technologyRequirement){
        boolean editTechnologyRequirement = technologyRequirementService.editTechnologyRequirement(technologyRequirement);
        if (editTechnologyRequirement){
            return new Tip("200","修改工艺管理成功",null);
        }
        return new Tip("0","修改失败",null);
    }

    //批量删除工艺要求信息
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids){
        boolean deleteTechnologyRequirement = technologyRequirementService.deleteBatchTechnologyRequirement(ids);
        if (deleteTechnologyRequirement){
            return new Tip("200","删除工艺要求成功",null);
        }
        return new Tip("0","删除失败",null);
    }

    //获取工艺信息
    @RequestMapping("get_data")
    @ResponseBody
    public List<Technology> getData(){
        List<Technology> data = technologyService.getData();
        return data;
    }

    @RequestMapping("update_requirement")
    @ResponseBody
    public Tip update_requirement(TechnologyRequirement technologyRequirement){
        boolean update = technologyRequirementService.updateByPrimaryKeySelective(technologyRequirement);
        if (update){
            return new Tip("200","更新工艺管理成功",null);
        }
        return new Tip("0","更新失败",null);
    }


}
