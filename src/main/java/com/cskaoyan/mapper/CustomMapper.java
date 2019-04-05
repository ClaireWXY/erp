package com.cskaoyan.mapper;
import com.cskaoyan.bean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface CustomMapper {
    int deleteByPrimaryKey(String customId);

    int  insert(Custom record);

    int insertSelective(Custom custom);

    Custom selectByPrimaryKey(String customId);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);

    ArrayList<Custom> selectAllCustom();

    int deleteBatchCustomByIds(@Param("ids") String[] ids);

    ArrayList<Custom> selectByName(@Param("customName") String customName);
}