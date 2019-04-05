package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Controller
@RequestMapping("technologyPlan")
public class TechnologyPlanController {



    @RequestMapping("*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    @RequestMapping("find")
    public String find() {
        return "technologyPlan_list";
    }

}
