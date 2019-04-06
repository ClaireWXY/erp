package com.cskaoyan.service;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.TotalAndList;

public interface MeasureService {
    TotalAndList findPageMeasureList(int page, int rows);

    TotalAndList findPageMeasureListById(String searchValue, int page, int rows);

    TotalAndList findPageMeasureListByOrderId(String searchValue, int page, int rows);

    boolean insertFinalMeasuretCheck(FinalMeasuretCheck finalMeasuretCheck);

    boolean updateFinalMeasuretCheck(FinalMeasuretCheck finalMeasuretCheck);

    boolean deleteFinalMeasuretCheck(String[] ids);
}
