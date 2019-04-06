package com.cskaoyan.controller;

import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.UnqualifyApplyVo;
import com.cskaoyan.service.QualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QualifyApplyController {
    @Autowired
    QualifyService qualifyService;
    @RequestMapping("unqualify/find")
    public String find(){

        return "unqualify_list";
    }

    @RequestMapping("unqualify/list")
    @ResponseBody
    public UnqualifyApplyVo findList(int page, int rows){
        UnqualifyApplyVo unqualifyCount = qualifyService.findUnqualifyCount(page, rows);
        return unqualifyCount;
    }

    @RequestMapping("unqualify/add_judge")
    @ResponseBody
    public String add_judge(){
        return "{}" ;
    }

    @RequestMapping("unqualify/add")
    public String add(){
        return "unqualify_add";
    }

    @RequestMapping("unqualify/edit_judge")
    @ResponseBody
    public String edit_judge(){
        return "{}";
    }

    @RequestMapping("unqualify/search_unqualify_by_unqualifyId")
    @ResponseBody
    public TotalAndList search_unqualify_by_unqualifyId(String searchValue, int page , int rows){
        TotalAndList unqualifyByUnqulifyId = qualifyService.findUnqualifyByUnqulifyId(searchValue, (page - 1 )* rows, rows);
        return unqualifyByUnqulifyId;
    }


    @RequestMapping("unqualify/search_unqualify_by_productName")
    @ResponseBody
    public TotalAndList search_unqualify_by_productName(String searchValue, int page , int rows){
        TotalAndList unqualifyByProductName = qualifyService.findUnqualifyByProductName(searchValue, (page - 1) * rows, rows);
        return unqualifyByProductName;
    }

    @RequestMapping("unqualify/insert")
    @ResponseBody
    public Tip insert(UnqualifyApply unqualifyApply){
        boolean b = qualifyService.insertUnqualify(unqualifyApply);

        if (b){
            return new Tip("200","添加成功!",null);
        }
        return new Tip("0","添加失败。",null);
    }
    @RequestMapping("unqualify/edit")
    public String edit(){
        return "unqualify_edit";
    }

    @RequestMapping("unqualify/update_all")
    @ResponseBody
    public Tip updateAll(UnqualifyApply unqualifyApply){
        boolean b = qualifyService.UpdateAll(unqualifyApply);
        if (b){
            return new Tip("200","修改成功!",null);
        }
        return new Tip("0","修改失败。",null);
    }

    @RequestMapping("unqualify/delete_batch")
    @ResponseBody
    public Tip deleteBatch(String[] ids){
        boolean b = qualifyService.deleteBatch(ids);
        if (b){
            return new Tip("200","删除成功!",null);
        }
        return new Tip("0","删除失败。",null);
    }


}
