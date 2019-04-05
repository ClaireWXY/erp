package com.cskaoyan.service;

import com.cskaoyan.bean.TotalAndList;

public interface FCountCheckService {
    TotalAndList findPageFinalCountList(int page, int rows);
}
