package com.cskaoyan.service;

import com.cskaoyan.bean.UnqualifyApplyVo;

public interface QualifyService {
    UnqualifyApplyVo findUnqualifyCount(int page,int rows);
}
