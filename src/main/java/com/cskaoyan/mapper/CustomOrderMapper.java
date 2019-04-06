package com.cskaoyan.mapper;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.CustomOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomOrderMapper {

    //根据键删除订单数据
    int deleteByPrimaryKey(String orderId);

    int insert(Custom record);

    int insertSelective(Custom record);

    Custom selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);

    //查询所有的订单
    List<CustomOrder> selectAllOrder();

    //删除多条数据
    int deleteBatchOrderByIds(@Param("ids") String[] ids);

}