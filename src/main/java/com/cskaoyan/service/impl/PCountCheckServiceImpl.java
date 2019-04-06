package com.cskaoyan.service.impl;

import com.cskaoyan.bean.PagePCountCheckList;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.ProcessCountCheckMapper;
import com.cskaoyan.service.PCountCheckService;
import jdk.management.resource.internal.TotalResourceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class PCountCheckServiceImpl implements PCountCheckService {
    @Autowired
    ProcessCountCheckMapper processCountCheckMapper;


    @Override
    public TotalAndList findPCountCheckList(int page, int rows) {
        List<PagePCountCheckList> pCountCheckList = processCountCheckMapper.findCountCheckList(page, rows);
        int i = processCountCheckMapper.PCountCheckCount();
        TotalAndList totalAndList = new TotalAndList();
        totalAndList.setTotal(i);
        totalAndList.setRows(pCountCheckList);
        return totalAndList;
    }

    @Override
    public TotalAndList findPCountCheckListById(String searchValue, int page, int rows) {
        List<PagePCountCheckList> pCountCheckList = processCountCheckMapper.findCountCheckListById(searchValue,page, rows);
        int i = processCountCheckMapper.PCountCheckCountById(searchValue);
        TotalAndList totalAndList = new TotalAndList();
        totalAndList.setTotal(i);
        totalAndList.setRows(pCountCheckList);
        return totalAndList;
    }
}
