package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.mapper.CustomMapper;
import com.cskaoyan.service.CustomService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    CustomMapper customMapper;

    //插入一条客户数据
    @Override
    public boolean insertCustom(Custom custom) {
        int i = customMapper.insertSelective(custom);
        return i==1;
    }

    //查询所有的客户数据
    @Override
    public ArrayList<Custom> selectAllCustom() {
        ArrayList<Custom> customList = customMapper.selectAllCustom();
        return customList;
    }


    //根据主键,删除数据
    @Override
    public boolean deleteBatchCustomByIds(String[] ids) {
        int i = customMapper.deleteBatchCustomByIds(ids);
        return i==ids.length;
    }

    //更改一条客户数据
    @Override
    public boolean updateCustomById(Custom custom) {
        int update = customMapper.updateByPrimaryKey(custom);
        return update==1;
    }

    //根据id搜索
    @Override
    public List<Custom> selectCustomById(String id) {
        List<Custom> customList = customMapper.selectByPrimaryKey(id);
        return customList;
    }

    //根据客户名称搜索
    @Override
    public ArrayList<Custom> selectCustomByName(String customName) {
        ArrayList<Custom> customList = customMapper.selectByName(customName);
        return customList;
    }
}
