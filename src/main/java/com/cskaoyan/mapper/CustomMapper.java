package com.cskaoyan.mapper;
import com.cskaoyan.bean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface CustomMapper {
    int deleteByPrimaryKey(String customId);

    int  insert(Custom record);

    int insertSelective(Custom custom);

    //根据客户的id,查询客户数据
    List<Custom> selectByPrimaryKey(String customId);

    int updateByPrimaryKeySelective(Custom record);

    //修改客户数据
    int updateByPrimaryKey(Custom record);

    //查询所有的客户
    ArrayList<Custom> selectAllCustom();

    //删除数据
    int deleteBatchCustomByIds(@Param("ids") String[] ids);


    ArrayList<Custom> selectByName(@Param("customName") String customName);

    Custom findOneCustomById(@Param("customId")  String customId);
}