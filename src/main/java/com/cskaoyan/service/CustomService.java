package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface CustomService {

    public ArrayList<Custom> selectAllCustom();

    public boolean insertCustom(Custom custom);

    boolean deleteBatchCustomByIds(String[] ids);

    boolean updateCustomById(Custom custom);

    Custom selectCustomById(String id);

    ArrayList<Custom> selectCustomByName(String customName);
}
