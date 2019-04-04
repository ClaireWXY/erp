package com.cskaoyan.mapper;

import com.cskaoyan.bean.Custom;

public interface CustomOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Custom record);

    int insertSelective(Custom record);

    Custom selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}