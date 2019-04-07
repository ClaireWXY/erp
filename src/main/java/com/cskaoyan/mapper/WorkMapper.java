package com.cskaoyan.mapper;

import com.cskaoyan.bean.Work;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkMapper {
    int deleteByPrimaryKey(String workId);

    //新增数据
    int insert(Work work);

    int insertSelective(Work record);

    Work selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(Work record);

    //修改数据
    int updateByPrimaryKey(Work record);

    // materialConsume用到的work记录
    List<Work> selectAllWork();

    //删除数据
    int deleteBatchWorkByIds(@Param("ids") String[] ids);

    //在页面上显示所有的work数据

    List<Work> queryAllWorks(@Param("offset") Integer offset,@Param("rows") Integer rows);
}