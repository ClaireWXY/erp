package com.cskaoyan.controller;

import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.bean.UnqualifyApplyVo;
import com.cskaoyan.service.QualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QualifyApplyController {
    @Autowired
    QualifyService qualifyService;
    @RequestMapping("unqualify/find")
    public String find(){

        return "unqualify_list";
    }

    @RequestMapping("unqualify/list")
    @ResponseBody
    public UnqualifyApplyVo findList(int page, int rows){
        UnqualifyApplyVo unqualifyCount = qualifyService.findUnqualifyCount(page, rows);
        return unqualifyCount;
    }

    @RequestMapping("unqualify/add_judge")
    @ResponseBody
    public String add_judge(){
        return "{}" ;
    }

    @RequestMapping("unqualify/add")
    public String add(){
        return "unqualify_add";
    }

    @RequestMapping("unqualify/edit_judge")
    @ResponseBody
    public String edit_judge(){
        return "{}";
    }

    @RequestMapping("unqualify/search_unqualify_by_unqualifyId")
    @ResponseBody
    public TotalAndList search_unqualify_by_unqualifyId(String searchValue, int page , int rows){
        TotalAndList unqualifyByUnqulifyId = qualifyService.findUnqualifyByUnqulifyId(searchValue, (page - 1 )* rows, rows);
        return unqualifyByUnqulifyId;
    }

    @RequestMapping("unqualify/search_unqualify_by_productName")
    @ResponseBody
    public TotalAndList search_unqualify_by_productName(String searchValue, int page , int rows){
        TotalAndList unqualifyByProductName = qualifyService.findUnqualifyByProductName(searchValue, (page - 1) * rows, rows);
        return unqualifyByProductName;
    }


}
