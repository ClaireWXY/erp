package com.cskaoyan.controller;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.CustomService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
//都是处理custom,所以窄化请求
@RequestMapping("custom")
public class CustomController {
    @Autowired
    CustomService customService;

    //组长完善代码
    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }

    //查询所有数据
    @RequestMapping("find")
    public String findCustom(){
        return "custom_list";
    }



    @RequestMapping("list")
    @ResponseBody
   /* //分页查询
    public ArrayList<Custom> customList(int page,int rows){
        ArrayList<Custom> customList = customService.selectAllCustom(page,rows);
        return customList;
    }*/
    public ArrayList<Custom> customList(){
        ArrayList<Custom> customList = customService.selectAllCustom();
        return customList;
    }

    /*//页面的跳转不是很懂，问的同学，转包看的不是很明白，前台页面看不明白
    //插入一条客户
    @RequestMapping("add_judge")
    @ResponseBody
    public String add_judge(){
        return "";
    }*/

    @RequestMapping("add")
    public String add(){
        return "custom_add";
    }

    //前端总是显示undefined
    //组长优化代码:增加Tip类，返回Json数据到前端,正常显示
    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Custom custom){

        boolean b = customService.insertCustom(custom);
        if (b){
            return new Tip("200","增加客户成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }

    //根据主键删除客户数据
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deletleBatchByIds(String[] ids){
        boolean b = customService.deleteBatchCustomByIds(ids);
        if(b){
            return new Tip("200","删除客户成功。",null);
        }
        return new Tip("0","删除失败。",null);
    }

    //根据键，修改一条客户数据
    @RequestMapping("edit")
    public String edit(){
        return "custom_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateCustom(Custom custom){
        boolean b = customService.updateCustomById(custom);
        if (b){
            return new Tip("200","修改客户成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }

    //根据客户编号查询客户信息
    @RequestMapping("search_custom_by_customId")
    @ResponseBody
    public Custom selectCustomById(String customId){
        Custom custom = customService.selectCustomById(customId);
        return custom;
    }

    //根据客户的名称查询客户信息
    @RequestMapping("search_custom_by_customName")
    @ResponseBody
    public ArrayList<Custom> selectCustomByName(String customName){
        ArrayList<Custom> customList= customService.selectCustomByName(customName);
        return customList;
    }
}
