package com.cskaoyan.controller;


import com.cskaoyan.bean.Work;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkService workService;

    @RequestMapping("get_data")
    @ResponseBody
    public List<Work> get_data(){
        List<Work> workList = workService.selectAllWork();
        return workList;
    }

    //这边要get_data之后才能看到效果
    @RequestMapping("get/{workId}")
    @ResponseBody
    public Work get(@PathVariable("workId")String workId) {
        return workService.getWorkById(workId);
    }
}
