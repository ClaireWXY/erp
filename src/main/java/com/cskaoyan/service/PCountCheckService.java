package com.cskaoyan.service;

import com.cskaoyan.bean.ProcessCountCheck;
import com.cskaoyan.bean.TotalAndList;
import jdk.management.resource.internal.TotalResourceContext;

public interface PCountCheckService {
    TotalAndList findPCountCheckList(int page, int rows);
    TotalAndList findPCountCheckListById(String searchValue, int page, int rows);

    boolean insertProcessCountCheck(ProcessCountCheck processCountCheck);

    boolean updateProcessCountCheck(ProcessCountCheck processCountCheck);

    boolean deleteProcessCountCheckByIds(String[] ids);
}
