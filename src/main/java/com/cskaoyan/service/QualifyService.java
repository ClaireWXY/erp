package com.cskaoyan.service;

import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.bean.UnqualifyApplyVo;

public interface QualifyService {
    UnqualifyApplyVo findUnqualifyCount(int page,int rows);

    TotalAndList findUnqualifyByUnqulifyId(String searchValue, int page, int rows);

    TotalAndList findUnqualifyByProductName(String searchValue, int page, int rows);
}
