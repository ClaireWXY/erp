package com.cskaoyan.mapper;

import com.cskaoyan.bean.Manufacture;
import org.apache.ibatis.annotations.Param;

public interface ManufactureMapper {
    int deleteByPrimaryKey(String manufactureSn);

    //新增数据
    int insert(Manufacture manufacture);

    int insertSelective(Manufacture record);

    Manufacture selectByPrimaryKey(String manufactureSn);

    int updateByPrimaryKeySelective(Manufacture record);

    //修改数据
    int updateByPrimaryKey(Manufacture record);

    //删除数据
    int deleteBatchManufactureByIds(@Param("ids") String[] ids);
}