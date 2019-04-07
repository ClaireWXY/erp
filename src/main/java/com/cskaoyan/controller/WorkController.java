package com.cskaoyan.controller;


import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Work;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkService workService;

    //_judge的处理
    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }

    @RequestMapping("find")
    public String find(){
        return "work_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Work> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Work> works = workService.queryAllWorks(page, rows);
        return works;
    }

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

    //根据主键删除客户数据
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deletleBatchByIds(String[] ids){
        boolean b = workService.deleteBatchWorkByIds(ids);
        if(b){
            return new Tip("200","删除客户成功。",null);
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
    public Tip updateCustom(Work work){
        boolean b = workService.updateWorkById(work);
        if (b){
            return new Tip("200","修改客户成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }

    //新增数据
    @RequestMapping("add")
    public String add(){
        return "work_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Work work){

        boolean b = workService.insertWork(work);
        if (b){
            return new Tip("200","增加客户成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }
}
