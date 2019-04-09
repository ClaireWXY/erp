package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Task;
import com.cskaoyan.mapper.TaskMapper;
import com.cskaoyan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public List<Task> selectAllTask() {
        List<Task> taskList = taskMapper.selectAllTask();
        return taskList;
    }

    @Override
    public boolean deleteBatchTaskByIds(String[] ids) {
        int i = taskMapper.deleteBatchTaskByIds(ids);
        return i==ids.length;
    }

    //修改数据
    @Override
    public boolean updateTaskById(Task task) {
        int update = taskMapper.updateByPrimaryKey(task);
        return update==1;
    }

    //新增数据
    @Override
    public boolean insertTask(Task task) {
        int i = taskMapper.insert(task);
        return i==1;
    }

    //查询所有
    @Override
    public List<Task> findAllTask(Integer page, Integer rows) {
        List<Task> taskList = taskMapper.findAllTask((page-1)*rows,rows);
        return taskList;
    }
}
