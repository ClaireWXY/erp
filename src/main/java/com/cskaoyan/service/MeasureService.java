package com.cskaoyan.service;

import com.cskaoyan.bean.TotalAndList;

public interface MeasureService {
    TotalAndList findPageMeasureList(int page, int rows);
}
