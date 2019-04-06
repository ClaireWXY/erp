package com.cskaoyan.controller;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Tip2;
import com.cskaoyan.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Controller
@RequestMapping("process")
public class ProcessController {

    @Autowired
    ProcessService processService;

    @RequestMapping("*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    @RequestMapping("find")
    public String find() {
        return "process_list";
    }

    /*@RequestMapping("list")
    @ResponseBody
    public List<Process> list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Process> processes = processService.queryAllProcess(page, rows);
        return processes;
    }*/

    @RequestMapping("list")
    @ResponseBody
    public Tip2 list(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        Tip2<Process> processTip2 = new Tip2<>();
        Integer countProcess = processService.countProcess();
        List<Process> processes = processService.queryAllProcess(page, rows);
        processTip2.setTotal(countProcess);
        processTip2.setRows(processes);
        return processTip2;
    }

    @RequestMapping("search_process_by_processId")
    @ResponseBody
    public List<Process> search_process_by_processId(@RequestParam("searchValue") String searchValue,@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        List<Process> processes = processService.searchProcessByProcessId(searchValue, page, rows);
        return processes;
    }

    @RequestMapping("search_process_by_technologyPlanId")
    @ResponseBody
    public Tip2<Process> search_process_by_technologyPlanId(@RequestParam("searchValue") String searchValue, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        Tip2<Process> processTip2 = new Tip2<>();
        int count = processService.countByTechnologyPlanId(searchValue);
        List<Process> technologyPlans = processService.searchProcessByTechnologyPlanId(searchValue, page, rows);
        processTip2 .setTotal(count);
        processTip2 .setRows(technologyPlans);
        return processTip2 ;
    }

    //增加一条工序信息
    @RequestMapping("add")
    public String add(){
        return "process_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Process process) {
        boolean addProcess = processService.addProcess(process);
        if (addProcess){
            return new Tip("200","新增工序成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    //修改工序信息
    @RequestMapping("edit")
    public String edit(){
        return "process_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(Process process){
        boolean editProcess = processService.editProcess(process);
        if (editProcess){
            return new Tip("200","修改工艺计划成功",null);
        }
        return new Tip("0","修改失败",null);
    }

    //批量删除工序信息
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids){
        boolean batchProcess = processService.deleteBatchProcess(ids);
        if (batchProcess){
            return new Tip("200","删除工艺计划成功",null);
        }
        return new Tip("0","删除失败",null);
    }

    @RequestMapping("/get/{processId}")
    @ResponseBody
    public Process get(@PathVariable("processId") String processId){
        Process process = processService.queryProcessById(processId);
        return process;
    }

    @RequestMapping("get_data")
    @ResponseBody
    public List<Process> getData(){
        List<Process> data = processService.getData();
        return data;
    }
}
