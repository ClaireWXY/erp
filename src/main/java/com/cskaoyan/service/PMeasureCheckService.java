package com.cskaoyan.service;

import com.cskaoyan.bean.TotalAndList;

public interface PMeasureCheckService {

    TotalAndList findPMeasureCheckList(int page, int rows);

    TotalAndList findPMeasureCheckListById(String searchValue,int page, int rows);
}
