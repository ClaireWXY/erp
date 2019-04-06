package com.cskaoyan.service;

import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.TotalAndList;

public interface PMeasureCheckService {

    TotalAndList findPMeasureCheckList(int page, int rows);

    TotalAndList findPMeasureCheckListById(String searchValue,int page, int rows);

    boolean insertProcessMeasureCheck(ProcessMeasureCheck processMeasureCheck);

    boolean updateProcessMeasureCheck(ProcessMeasureCheck processMeasureCheck);

    boolean deleteProcessMeasureCheckByIds(String[] ids);

}
