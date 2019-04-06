package com.cskaoyan.mapper;

import com.cskaoyan.bean.Process;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.List;

public interface ProcessMapper {
    int deleteByPrimaryKey(String processId);

    int insert(Process record);

    int insertSelective(Process record);

    Process selectByPrimaryKey(String processId);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);

    //根据需求添加的接口
    Integer countProcess();

    List<Process> queryAllProcess(@Param("offset") Integer offset, @Param("rows") Integer rows);

    List<Process> searchProcessByProcessId(@Param("processId") String processId, @Param("offset") Integer offset, @Param("rows") Integer rows);

    Integer countByTechnologyPlanId(@Param("technologyPlanId") String technologyPlanId);

    List<Process> searchProcessByTechnologyPlanId(@Param("technologyPlanId") String technologyPlanId,@Param("offset") Integer offset,@Param("rows") Integer rows);

    int deleteBatchProcessByIds(String[] ids);

    List <Process> findAllProcess();

}