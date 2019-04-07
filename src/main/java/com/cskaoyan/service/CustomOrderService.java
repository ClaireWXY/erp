package com.cskaoyan.service;

import com.cskaoyan.bean.CustomOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomOrderService {

    //查询所有的订单
    List<CustomOrder> findAllCustomOrder(Integer page,Integer rows);
    //删除一条数据
    boolean deleteByPrimaryKey(String orderId);

    //删除多条订单数据
    boolean deleteBatchOrderByIds(String[] ids);

    boolean updateCustomOrderById(CustomOrder customOrder);

    //新增一条数据
    boolean insertCustomOrder(CustomOrder customOrder);
}
