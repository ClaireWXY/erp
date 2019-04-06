package com.cskaoyan.controller;

import com.cskaoyan.bean.ProcessCountCheck;
import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.service.PCountCheckService;
import jdk.management.resource.internal.TotalResourceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("p_count_check")
public class PCountCheckController {
    @Autowired
    PCountCheckService pCountCheckService;

    @RequestMapping("find")
    public String find(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("pCountCheck:add");
        arrayList.add("pCountCheck:edit");
        arrayList.add("pCountCheck:delete");
        session.setAttribute("sysPermissionList", arrayList);
        return "p_count_check_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public TotalAndList list(int page, int rows) {
        TotalAndList pMeasureCheckList = pCountCheckService.findPCountCheckList((page - 1) * rows, rows);
        return pMeasureCheckList;
    }

    @RequestMapping("search_pCountCheck_by_pCountCheckId")
    @ResponseBody
    public TotalAndList searchPCountCheckByPCountCheckId(String searchValue,int page,int rows) {
        TotalAndList pCountCheckListById = pCountCheckService.findPCountCheckListById(searchValue, (page - 1) * rows, rows);
        return pCountCheckListById;
    }

    @RequestMapping("add")
    public String add(){
        return "p_count_check_add";
    }

    @RequestMapping("edit")
    public String edit(){
        return "p_count_check_edit";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(ProcessCountCheck processCountCheck){
        boolean b = pCountCheckService.insertProcessCountCheck(processCountCheck);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateAll(ProcessCountCheck processCountCheck){
        boolean b = pCountCheckService.updateProcessCountCheck(processCountCheck);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteBatch(String[] ids){
        boolean b = pCountCheckService.deleteProcessCountCheckByIds(ids);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

}
