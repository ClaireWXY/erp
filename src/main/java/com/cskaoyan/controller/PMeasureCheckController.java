package com.cskaoyan.controller;

import com.cskaoyan.bean.FinalCountCheck;
import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.service.PMeasureCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("p_measure_check")
public class PMeasureCheckController {
    @Autowired
    PMeasureCheckService pMeasureCheckService;

    @RequestMapping("find")
    public String find(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("pMeasureCheck:add");
        arrayList.add("pMeasureCheck:edit");
        arrayList.add("pMeasureCheck:delete");
        session.setAttribute("sysPermissionList", arrayList);
        return "p_measure_check_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public TotalAndList list(int page,int rows) {
        TotalAndList pMeasureCheckList = pMeasureCheckService.findPMeasureCheckList((page - 1) * rows, rows);
        return pMeasureCheckList;
    }

    @RequestMapping("search_pMeasureCheck_by_pMeasureCheckId")
    @ResponseBody
    public TotalAndList searchPMeasureCheckByPMeasureCheckId(String searchValue,int page,int rows) {
        TotalAndList pMeasureCheckListById = pMeasureCheckService.findPMeasureCheckListById(searchValue ,(page - 1) * rows, rows);
        return pMeasureCheckListById;
    }
    @RequestMapping("add")
    public String add(){
        return "p_measure_check_add";
    }

    @RequestMapping("edit")
    public String edit(){
        return "p_measure_check_edit";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(ProcessMeasureCheck processMeasureCheck){
        boolean b = pMeasureCheckService.insertProcessMeasureCheck(processMeasureCheck);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateAll(ProcessMeasureCheck processMeasureCheck){
        boolean b = pMeasureCheckService.updateProcessMeasureCheck(processMeasureCheck);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteBatch(String[] ids){
        boolean b = pMeasureCheckService.deleteProcessMeasureCheckByIds(ids);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

}

