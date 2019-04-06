package com.cskaoyan.service.impl;

import com.cskaoyan.bean.PagePMeasureCheckList;
import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
import com.cskaoyan.service.PMeasureCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PMeasureCheckServiceImpl implements PMeasureCheckService {
    @Autowired
    ProcessMeasureCheckMapper processMeasureCheckMapper;

    @Override
    public TotalAndList findPMeasureCheckList(int page, int rows) {
        List<PagePMeasureCheckList> pMeasureCheckList = processMeasureCheckMapper.findPMeasureCheckList(page, rows);
        int i = processMeasureCheckMapper.PMeasureCheckCount();
        TotalAndList totalAndList = new TotalAndList(i,pMeasureCheckList);
        return totalAndList;
    }

    @Override
    public TotalAndList findPMeasureCheckListById(String searchValue, int page, int rows) {
        List<PagePMeasureCheckList> pMeasureCheckListById = processMeasureCheckMapper.findPMeasureCheckListById(searchValue, page, rows);
        int i = processMeasureCheckMapper.PMeasureCheckCountById(searchValue);
        TotalAndList totalAndList = new TotalAndList(i, pMeasureCheckListById);
        return totalAndList;
    }

    @Override
    public boolean insertProcessMeasureCheck(ProcessMeasureCheck processMeasureCheck) {
        int insert = processMeasureCheckMapper.insert(processMeasureCheck);
        return insert==1;
    }

    @Override
    public boolean updateProcessMeasureCheck(ProcessMeasureCheck processMeasureCheck) {
        int i = processMeasureCheckMapper.updateByPrimaryKey(processMeasureCheck);
        return i==1;
    }

    @Override
    public boolean deleteProcessMeasureCheckByIds(String[] ids) {
        int i = processMeasureCheckMapper.deleteProcessMeasureCheckByIds(ids);
        return i!=0;
    }


}
