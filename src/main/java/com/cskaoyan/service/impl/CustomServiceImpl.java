package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.mapper.CustomMapper;
import com.cskaoyan.service.CustomService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    CustomMapper customMapper;

    @Override
    public boolean insertCustom(Custom custom) {
        int i = customMapper.insertSelective(custom);
        return i==1;
    }

    @Override
    public ArrayList<Custom> selectAllCustom() {
        ArrayList<Custom> customList = customMapper.selectAllCustom();
        return customList;
    }
}
