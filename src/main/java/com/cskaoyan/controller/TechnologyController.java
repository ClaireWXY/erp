package com.cskaoyan.controller;

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
    @RequestMapping("add_judge")
    public String add_judge() {
        return "technology_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public String insert(Technology technology) {
        boolean addTechnology = technologyService.addTechnology(technology);
        if (addTechnology) {
            return "technology_list";
        }
        return "technology_add";
    }
}
