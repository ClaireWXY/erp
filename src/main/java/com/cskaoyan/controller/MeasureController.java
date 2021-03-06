package com.cskaoyan.controller;


import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.service.MeasureService;
import com.cskaoyan.service.impl.MeasureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("measure")
public class MeasureController {

   @Autowired
   MeasureService measureService;


    @RequestMapping("find")
    public String find(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("fMeasureCheck:add");
        arrayList.add("fMeasureCheck:edit");
        arrayList.add("fMeasureCheck:delete");
        session.setAttribute("sysPermissionList", arrayList);
        return "measurement_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public TotalAndList list(int page,int rows){
        TotalAndList totalAndList=measureService.findPageMeasureList((page-1)*rows,rows);
        return totalAndList;
    }
    @RequestMapping("search_fMeasureCheck_by_fMeasureCheckId")
    @ResponseBody
    public TotalAndList searchFMeasureCheckByFMeasureCheckId(String searchValue,int page,int rows){
        TotalAndList pageMeasureListById = measureService.findPageMeasureListById(searchValue, (page-1)*rows, rows);
        return pageMeasureListById;
    }

    @RequestMapping("search_fMeasureCheck_by_orderId")
    @ResponseBody
    public TotalAndList searchFMeasureCheckByorderId(String searchValue,int page,int rows){
        TotalAndList pageMeasureListByOrderId = measureService.findPageMeasureListByOrderId(searchValue, (page-1)*rows, rows);
        return pageMeasureListByOrderId;
    }

    @RequestMapping("add")
    public String add(){
        return "measurement_add";
    }

    @RequestMapping("edit")
    public String edit(){
        return "measurement_edit";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(FinalMeasuretCheck finalMeasuretCheck){
        boolean b = measureService.insertFinalMeasuretCheck(finalMeasuretCheck);

        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateAll(FinalMeasuretCheck finalMeasuretCheck){
        boolean b = measureService.updateFinalMeasuretCheck(finalMeasuretCheck);
        if (b){
            return new Tip("200","修改成功!",null);
        }
        return new Tip("0","修改失败。",null);
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteBatch(String[] ids){
        boolean b = measureService.deleteFinalMeasuretCheck(ids);
        System.out.println(b);
        if (b){
            return new Tip("200","修改成功!",null);
        }
        return new Tip("0","修改失败。",null);
    }


}
