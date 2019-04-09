package com.cskaoyan.mapper;


import com.cskaoyan.bean.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskMapper {
    int deleteByPrimaryKey(String taskId);

    //新增数据
    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(Task record);

    //修改数据
    int updateByPrimaryKey(Task record);

    List<Task> selectAllTask();

    //删除数据
    int deleteBatchTaskByIds(@Param("ids") String[] ids);

    //查询所有
    List<Task> findAllTask(@Param("offset") Integer offest, @Param("rows") Integer rows);
}
