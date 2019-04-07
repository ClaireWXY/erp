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

    //删除数据
    @Override
    public boolean deleteBatchWorkByIds(String[] ids) {
        int i = workMapper.deleteBatchWorkByIds(ids);
        return i==ids.length;
    }

    //修改数据

    @Override
    public boolean updateWorkById(Work work) {
        int update = workMapper.updateByPrimaryKey(work);
        return update==1;
    }

    //新增数据
    @Override
    public boolean insertWork(Work work) {
        int i = workMapper.insert(work);
        return i==1;
    }
}
