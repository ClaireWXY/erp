package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface CustomService {

    public ArrayList<Custom> selectAllCustom();

    public boolean insertCustom(Custom custom);

    boolean deleteBatchCustomByIds(String[] ids);

    boolean updateCustomById(Custom custom);

    List<Custom> selectCustomById(String id);

    //根据客户名称查询客户数据
    ArrayList<Custom> selectCustomByName(String customName);

    //通过id找到单个用户
    Custom findOneCustomById(String id);


}
