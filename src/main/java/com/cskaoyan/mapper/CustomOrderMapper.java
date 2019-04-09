package com.cskaoyan.mapper;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.CustomOrder;
import com.cskaoyan.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomOrderMapper {

    //根据键删除订单数据
    int deleteByPrimaryKey(String orderId);

    //新增
    int insert(CustomOrder customOrder);
    //新增
    int insertSelective(CustomOrder customOrder);

    Custom selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Custom record);

    //修改数据
    int updateByPrimaryKey(CustomOrder customOrder);

    //查询所有的订单
    List<CustomOrder> selectAllOrder(@Param("offset") Integer offset,@Param("rows") Integer rows);

    //删除多条数据
    int deleteBatchOrderByIds(@Param("ids") String[] ids);

    /*//根据订单编号修改订单要求
    int updateNote(@Param("product")Product product);*/

}