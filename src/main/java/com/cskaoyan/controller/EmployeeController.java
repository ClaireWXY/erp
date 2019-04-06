package com.cskaoyan.controller;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.Employee;
import com.cskaoyan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("get_data")
    @ResponseBody
    public List<Employee> getData(){
        List<Employee> allEmployee = employeeService.findAllEmployee();
        System.out.println(allEmployee);
        System.out.println(allEmployee);
        return allEmployee;
    }
}
