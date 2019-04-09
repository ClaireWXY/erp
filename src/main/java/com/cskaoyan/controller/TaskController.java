package com.cskaoyan.controller;

import com.cskaoyan.bean.Task;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("task")
public class TaskController {
    @Autowired
    TaskService taskService;

    //_judge的处理
    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }


    @RequestMapping("find")
    public String find(){
        return "task_list";
    }

    /*@RequestMapping("list")
    @ResponseBody
    public List<Task> list(){
        List<Task> taskList = taskService.selectAllTask();
        return taskList;
    }*/

    @RequestMapping("list")
    @ResponseBody
    public List<Task> findAllManufacture(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Task> taskList = taskService.findAllTask(page, rows);
        return taskList;
    }


    //批量删除
    //根据主键删除客户数据
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deletleBatchByIds(String[] ids){
        boolean b = taskService.deleteBatchTaskByIds(ids);
        if(b){
            return new Tip("200","删除成功。",null);
        }
        return new Tip("0","删除失败。",null);
    }


    //修改数据
    //根据键，修改一条客户数据
    @RequestMapping("edit")
    public String edit(){
        return "work_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateTask(Task task){
        boolean b = taskService.updateTaskById(task);
        if (b){
            return new Tip("200","修改成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }

    //新增一条数据
    @RequestMapping("add")
    public String add(){
        return "task_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Task task){

        boolean b = taskService.insertTask(task);
        if (b){
            return new Tip("200","增加成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }

}
