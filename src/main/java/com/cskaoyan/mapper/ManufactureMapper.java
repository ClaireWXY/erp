package com.cskaoyan.mapper;

import com.cskaoyan.bean.Manufacture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    //获取所有的数据
    List<Manufacture> findAllManufacture(@Param("offset") Integer offset, @Param("rows") Integer rows);

    //查询所有的个数
    Integer countManufacture();
}