package com.cskaoyan.service;

import com.cskaoyan.bean.Work;

import java.util.List;

public interface WorkService {
    List<Work> selectAllWork();


    Work getWorkById(String workId);

    //删除数据
    boolean deleteBatchWorkByIds(String[] ids);

    //修改数据
    boolean updateWorkById(Work work);

    //新增数据
    boolean insertWork(Work work);
}
