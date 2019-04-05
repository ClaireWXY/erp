package com.cskaoyan.service.impl;

import com.cskaoyan.bean.PageMasureList;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MeasureService")
public class MeasureServiceImpl implements MeasureService {
    @Autowired
    FinalMeasuretCheckMapper finalMeasuretCheckMapper;


    @Override
    public TotalAndList findPageMeasureList(int page, int rows) {
        List<PageMasureList> pageMeasureList = finalMeasuretCheckMapper.findPageMeasureList(page, rows);
        int i = finalMeasuretCheckMapper.measureCount();
        TotalAndList totalAndList = new TotalAndList();
        totalAndList.setTotal(i);
        totalAndList.setRows(pageMeasureList);

        return totalAndList;
    }

    @Override
    public TotalAndList findPageMeasureListById(String searchValue, int page, int rows) {
        List<PageMasureList> pageMeasureListById = finalMeasuretCheckMapper.findPageMeasureListById(searchValue, page, rows);
        int i = finalMeasuretCheckMapper.measureCountById(searchValue);
        TotalAndList totalAndList = new TotalAndList(i,pageMeasureListById);
        return totalAndList;
    }

    @Override
    public TotalAndList findPageMeasureListByOrderId(String searchValue, int page, int rows) {
        List<PageMasureList> pageMeasureListByOrderId = finalMeasuretCheckMapper.findPageMeasureListByOrderId(searchValue, page, rows);
        int i = finalMeasuretCheckMapper.measureCountByOrderId(searchValue);
        TotalAndList totalAndList = new TotalAndList(i,pageMeasureListByOrderId);
        return totalAndList;
    }


}
