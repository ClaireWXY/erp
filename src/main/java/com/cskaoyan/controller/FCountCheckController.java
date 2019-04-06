package com.cskaoyan.controller;

import com.cskaoyan.bean.FinalCountCheck;
import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.FinalCountCheckMapper;
import com.cskaoyan.service.FCountCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("f_count_check")
public class FCountCheckController {

    @Autowired
    FCountCheckService fCountCheckService;

    @RequestMapping("find")
    public String find(HttpServletRequest request){
        HttpSession session = request.getSession();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("fCountCheck:add");
        arrayList.add("fCountCheck:edit");
        arrayList.add("fCountCheck:delete");
        session.setAttribute("sysPermissionList", arrayList);
        return "f_count_check_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public TotalAndList list(int page,int rows){
        TotalAndList pageFinalCountList = fCountCheckService.findPageFinalCountList((page - 1) * rows, rows);
        return pageFinalCountList;
    }
    @RequestMapping("search_fCountCheck_by_fCountCheckId")
    @ResponseBody
    public TotalAndList searchFCountCheckByFCountCheckId(String searchValue,int page,int rows){
        TotalAndList pageMeasureListById = fCountCheckService.findfCountCheckById(searchValue, (page-1)*rows, rows);
        return pageMeasureListById;
    }

    @RequestMapping("search_fCountCheck_by_orderId")
    @ResponseBody
    public TotalAndList searchFCountCheckByFCountCheckOrderId(String searchValue,int page,int rows){
        TotalAndList pageMeasureListById = fCountCheckService.findfCountCheckByOrderId(searchValue, (page-1)*rows, rows);
        return pageMeasureListById;
    }

    @RequestMapping("add")
    public String add(){
        return "f_count_check_add";
    }

    @RequestMapping("edit")
    public String edit(){
        return "f_count_check_edit";
    }


    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(FinalCountCheck finalCountCheck){
        boolean b = fCountCheckService.insertFinalCountCheck(finalCountCheck);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }
    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateAll(FinalCountCheck finalCountCheck){
        boolean b = fCountCheckService.updateFinalCountCheck(finalCountCheck);
        if (b){
            return new Tip("200","修改成功!",null);
        }
        return new Tip("0","修改失败。",null);
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteBatch(String[] ids){
        boolean b = fCountCheckService.deleteFinalCountCheckByIds(ids);
        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

}
