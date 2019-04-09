package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.mapper.ManufactureMapper;
import com.cskaoyan.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {

    @Autowired
    ManufactureMapper manufactureMapper;

    //删除数据
    @Override
    public boolean deleteBatchManufactureByIds(String[] ids) {
        int i = manufactureMapper.deleteBatchManufactureByIds(ids);
        return i==ids.length;
    }

    //修改数据
    @Override
    public boolean updateManufactureById(Manufacture manufacture) {
        int update = manufactureMapper.updateByPrimaryKey(manufacture);
        return update==1;
    }

    //新增数据

    @Override
    public boolean insertManufacture(Manufacture manufacture) {
        int i = manufactureMapper.insert(manufacture);
        return i==1;
    }

    //分页获取所有的数据
    @Override
    public List<Manufacture> findAllManufacture(Integer page, Integer rows) {
        List<Manufacture> manufactureList = manufactureMapper.findAllManufacture((page-1)*rows,rows);

        return manufactureList;
    }

    @Override
    public Integer countManufacture() {
        Integer count = manufactureMapper.countManufacture();
        return count;
    }
}
