package com.cskaoyan.controller;

import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.service.TechnologyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<Technology> list(@Param("page") Integer page, @Param("rows") Integer rows) {
        List<Technology> technologies = technologyService.queryAllTechnology(page, rows);
        return technologies;
    }

    /**
     * 按照工艺编号查询工艺
     */
    @RequestMapping("search_technology_by_technologyId")
    @ResponseBody
    public List<Technology> search_technology_by_technologyId(@Param("searchValue") String searchValue,@Param("page") Integer page, @Param("rows") Integer rows){
        List<Technology> technologies = technologyService.searchTechnologyByTechnologyId(searchValue, page, rows);
        return technologies;
    }

    /**
     * 按照工艺名称查询工艺
     */
    @RequestMapping("search_technology_by_technologyName")
    @ResponseBody
    public List<Technology> search_technology_by_technologyName(@Param("searchValue") String searchValue,@Param("page") Integer page, @Param("rows") Integer rows){
        List<Technology> technologies = technologyService.searchTeachnologyByTechnologyName(searchValue, page, rows);
        return technologies;
    }

    /**
     * 增加一条工艺数据
     */
    @RequestMapping("add")
    public String add(@Param("technology") Technology technology){
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

    @RequestMapping("edit")
    public String edit(@Param("technology") Technology technology){
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





}
