package com.cskaoyan.service;

import com.cskaoyan.bean.Task;

import java.util.List;

public interface TaskService {
     List<Task> selectAllTask();

     //删除数据
     boolean deleteBatchTaskByIds(String[] ids);

     //修改数据
     boolean updateTaskById(Task task);

     //新增数据
     boolean insertTask(Task task);

     //查询
     List<Task> findAllTask(Integer page, Integer rows);

}
