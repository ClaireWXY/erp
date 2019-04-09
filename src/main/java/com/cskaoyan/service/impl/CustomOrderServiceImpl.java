package com.cskaoyan.service.impl;

import com.cskaoyan.bean.CustomOrder;
import com.cskaoyan.bean.Product;
import com.cskaoyan.mapper.CustomOrderMapper;
import com.cskaoyan.service.CustomOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomOrderServiceImpl implements CustomOrderService {

    @Autowired
    CustomOrderMapper customOrderMapper;

    //查询所有的订单
    @Override
    public List<CustomOrder> findAllCustomOrder(Integer page,Integer rows) {
        List<CustomOrder> orderList = customOrderMapper.selectAllOrder((page-1)*rows,rows);
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

   //修改数据

    @Override
    public boolean updateCustomOrderById(CustomOrder customOrder) {
        int update = customOrderMapper.updateByPrimaryKey(customOrder);
        return update==1;
    }

    //新增数据
    @Override
    public boolean insertCustomOrder(CustomOrder customOrder) {
        int i = customOrderMapper.insert(customOrder);
        return i==1;
    }

    //修改订单要求
    @Override
    public boolean updateNote(CustomOrder customOrder) {
        int i = customOrderMapper.updateByPrimaryKey(customOrder);
        return i==1;
    }
}
