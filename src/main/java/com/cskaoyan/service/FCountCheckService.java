package com.cskaoyan.service;

import com.cskaoyan.bean.FinalCountCheck;
import com.cskaoyan.bean.TotalAndList;

public interface FCountCheckService {
    TotalAndList findPageFinalCountList(int page, int rows);

    TotalAndList findfCountCheckById(String searchValue, int page, int rows);

    TotalAndList findfCountCheckByOrderId(String searchValue, int page, int rows);

    boolean insertFinalCountCheck(FinalCountCheck finalCountCheck);

    boolean updateFinalCountCheck(FinalCountCheck finalCountCheck);

    boolean deleteFinalCountCheckByIds(String[] ids);
}
