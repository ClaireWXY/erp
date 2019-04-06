package com.cskaoyan.controller;

import com.cskaoyan.bean.Department;
import com.cskaoyan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("get_data")
    @ResponseBody
    public List<Department> getData(){
        List<Department> allDepartment = departmentService.findAllDepartment();
        return allDepartment;
    }
}
