package com.cskaoyan.controller;

import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Controller
@RequestMapping("technology")

public class TechnologyController {
    @Autowired
    TechnologyService technologyService;

    @RequestMapping("*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    @RequestMapping("find")
    public String find() {
        return "technology_list";
    }

    /**
     * 查询所有的数据
     */
    @RequestMapping("list")
    @ResponseBody
    public List<Technology> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        List<Technology> technologies = technologyService.queryAllTechnology(page, rows);
        return technologies;
    }

    /**
     * 按照工艺编号查询工艺
     */
    @RequestMapping("search_technology_by_technologyId")
    @ResponseBody
    public List<Technology> search_technology_by_technologyId(@RequestParam("searchValue") String searchValue,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Technology> technologies = technologyService.searchTechnologyByTechnologyId(searchValue, page, rows);
        return technologies;
    }

    /**
     * 按照工艺名称查询工艺
     */
    @RequestMapping("search_technology_by_technologyName")
    @ResponseBody
    public List<Technology> search_technology_by_technologyName(@RequestParam("searchValue") String searchValue,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Technology> technologies = technologyService.searchTeachnologyByTechnologyName(searchValue, page, rows);
        return technologies;
    }

    /**
     * 增加一条工艺数据
     * @return
     */
    @RequestMapping("add")
    public String add(){
        return "technology_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Technology technology) {
        boolean addTechnology = technologyService.addTechnology(technology);
        if (addTechnology){
           return new Tip("200","新增工艺成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    /**
     * 修改工艺信息
     * @param
     * @return
     */
    @RequestMapping("edit")
    public String edit(){
        return "technology_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(Technology technology){
        boolean editTechnology = technologyService.editTechnology(technology);
        if (editTechnology){
            return new Tip("200","修改工艺成功",null);
        }
        return new Tip("0","修改失败",null);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids){
        boolean deleteTechnology = technologyService.deleteBatchTechnology(ids);
        if (deleteTechnology){
            return new Tip("200","删除工艺成功",null);
        }
        return new Tip("0","删除失败",null);
    }

    //工艺要求和工艺计划需要的，get请求，可以编辑信息
    @RequestMapping("/get/{technologyId}")
    @ResponseBody
    public Technology get(@PathVariable("technologyId") String technologyId){
        Technology technology = technologyService.queryTechnologyById(technologyId);
        return technology;
    }

    //获取工艺信息
    @RequestMapping("get_data")
    @ResponseBody
    public List<Technology> getData(){
        List<Technology> data = technologyService.getData();
        return data;
    }

}
