package com.cskaoyan.controller;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.Tip2;
import com.cskaoyan.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("manufacture")
public class ManufactureController {
    @Autowired
    ManufactureService manufactureService;


    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }

    //分页查询所有的数据
    @RequestMapping("find")
    public String find(){
        return "manufacture_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public Tip2<Manufacture> findAllManufacture(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows){
        Tip2<Manufacture> manufactureTip2 = new Tip2<>();
        Integer count = manufactureService.countManufacture();
        List<Manufacture> manufactureList = manufactureService.findAllManufacture(page, rows);
        manufactureTip2.setTotal(count);
        manufactureTip2.setRows(manufactureList);
        return manufactureTip2;
    }

    //删除数据
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deletleBatchByIds(String[] ids){
        boolean b = manufactureService.deleteBatchManufactureByIds(ids);
        if(b){
            return new Tip("200","删除成功。",null);
        }
        return new Tip("0","删除失败。",null);
    }

    //修改数据
    @RequestMapping("edit")
    public String edit(){
        return "manufacture_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateManufacture(Manufacture manufacture){
        boolean b = manufactureService.updateManufactureById(manufacture);
        if (b){
            return new Tip("200","修改成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }

    //新增一条数据
    @RequestMapping("add")
    public String add(){
        return "manufacture_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Manufacture manufacture){

        boolean b = manufactureService.insertManufacture(manufacture);
        if (b){
            return new Tip("200","增加客户成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }
}
