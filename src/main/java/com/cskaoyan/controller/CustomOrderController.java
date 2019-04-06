package com.cskaoyan.controller;

import com.cskaoyan.bean.CustomOrder;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.CustomOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    //查询所有的顾客订单的数据
    @RequestMapping("find")
    public String find(){
        return "order_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<CustomOrder> findAllCustomOrder(){
        List<CustomOrder> orderList = customOrderService.findAllCustomOrder();
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
}
