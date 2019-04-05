package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Work;
import com.cskaoyan.mapper.WorkMapper;
import com.cskaoyan.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkMapper workMapper;


    @Override
    public List<Work> selectAllWork() {
        List<Work> workList = workMapper.selectAllWork();
        return workList;
    }

    @Override
    public Work getWorkById(String workId) {
        Work work = workMapper.selectByPrimaryKey(workId);
        return work;
    }
}
