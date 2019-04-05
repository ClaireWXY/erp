package com.cskaoyan.controller;

import com.cskaoyan.bean.Work;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkService workService;

    @RequestMapping("get_data")
    public List<Work> get_data(){
        List<Work> workList = workService.selectAllWork();
        return workList;
    }
}
