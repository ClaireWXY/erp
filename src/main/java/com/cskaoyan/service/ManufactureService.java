package com.cskaoyan.service;

import com.cskaoyan.bean.Manufacture;

import java.util.List;

public interface ManufactureService {
    //删除数据
    boolean deleteBatchManufactureByIds(String[] ids);

    //修改数据
    boolean updateManufactureById(Manufacture manufacture);

    //新增数据
    boolean insertManufacture(Manufacture manufacture);

    //查询所有的数据
    List<Manufacture> findAllManufacture(Integer page, Integer rows);

    Integer countManufacture();
}
