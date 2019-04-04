package com.cskaoyan.controller;

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
}
