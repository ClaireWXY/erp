package com.cskaoyan.service;

import com.cskaoyan.bean.Custom;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface CustomService {

    public ArrayList<Custom> selectAllCustom();
    public boolean insertCustom(Custom custom);
}
