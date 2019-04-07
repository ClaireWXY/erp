package com.cskaoyan.controller;

import com.cskaoyan.bean.CustomOrder;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.CustomOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("order")
public class CustomOrderController {

    @Autowired
    CustomOrderService customOrderService;

    //_judge的处理
    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }

    @RequestMapping("find")
    public String find(){
        return "order_list";
    }

    //查询所有的顾客订单的数据
    @RequestMapping("list")
    @ResponseBody
    public List<CustomOrder> findAllCustomOrder(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows){
        List<CustomOrder> orderList = customOrderService.findAllCustomOrder(page,rows);
        return orderList;
    }


   /* @RequestMapping("list")
    @ResponseBody
    public List<Order> findAllOrder(){
        List<Order>  orderList =  customOrderService.findAllOrder();
        return orderList;
    }*/

    //根据键删除订单数据
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteOrder(String[] ids){
        boolean delete = customOrderService.deleteBatchOrderByIds(ids);
        if(delete){
            return new Tip("200","删除成功",null);
        }
        return new Tip("0","删除失败",null);
    }

    /*@RequestMapping("get_data")
    @ResponseBody
    public List<CustomOrder> getData(){
        List<CustomOrder> orderList = customOrderService.findAllCustomOrder(page,rows);
        return orderList;
    }*/

    //根据键，修改一条客户数据
    @RequestMapping("edit")
    public String edit(){
        return "order_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateCustom(CustomOrder customOrder){
        boolean b = customOrderService.updateCustomOrderById(customOrder);
        if (b){
            return new Tip("200","修改成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }

    //新增一条数据
    @RequestMapping("add")
    public String add(){
        return "order_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(CustomOrder customOrder){

        boolean b = customOrderService.insertCustomOrder(customOrder);
        if (b){
            return new Tip("200","增加成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }
}
