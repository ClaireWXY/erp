package com.cskaoyan.service.impl;

import com.cskaoyan.bean.CustomOrder;
import com.cskaoyan.mapper.CustomOrderMapper;
import com.cskaoyan.service.CustomOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomOrderServiceImpl implements CustomOrderService {

    @Autowired
    CustomOrderMapper customOrderMapper;

    //查询所有的订单
    @Override
    public List<CustomOrder> findAllCustomOrder() {
        List<CustomOrder> orderList = customOrderMapper.selectAllOrder();
        return orderList;
    }

   //删除一条数据
    @Override
    public boolean deleteByPrimaryKey(String orderId) {
        int delete = customOrderMapper.deleteByPrimaryKey(orderId);
        return delete==1;
    }

    //删除多条数据
    @Override
    public boolean deleteBatchOrderByIds(String[] ids) {
        int i = customOrderMapper.deleteBatchOrderByIds(ids);
        return i==ids.length;
    }
}
