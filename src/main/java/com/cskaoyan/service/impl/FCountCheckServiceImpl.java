package com.cskaoyan.service.impl;

import com.cskaoyan.bean.PageFinalCountList;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.FinalCountCheckMapper;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.service.FCountCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FCountCheckServiceImpl implements FCountCheckService {

    @Autowired
    FinalCountCheckMapper finalCountCheckMapper;
    @Override
    public TotalAndList findPageFinalCountList(int page, int rows) {
        List<PageFinalCountList> pageFinalCountList = finalCountCheckMapper.findPageFinalCountList(page, rows);
        int i = finalCountCheckMapper.finalCountCheckCount();
        TotalAndList totalAndList = new TotalAndList(i,pageFinalCountList);
        return totalAndList;
    }
}
