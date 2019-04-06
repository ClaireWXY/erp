package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyRequirement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyPlanMapper {
    int deleteByPrimaryKey(String technologyPlanId);

    int insert(TechnologyPlan record);

    int insertSelective(TechnologyPlan record);

    TechnologyPlan selectByPrimaryKey(String technologyPlanId);

    int updateByPrimaryKeySelective(TechnologyPlan record);

    int updateByPrimaryKey(TechnologyPlan record);

    //根据需求写的接口

    List<TechnologyPlan> queryAllTechnologyPlan(@Param("offset") Integer offset, @Param("rows") Integer rows);

    List<TechnologyPlan> searchTechnologyPlanByTechnologyPlanId(@Param("technologyPlanId") String technologyPlanId, @Param("offset") Integer offset, @Param("rows") Integer rows);

    int countByTechnologyName(@Param("technologyName") String technologyName );

    List<TechnologyPlan> searchTechnologyPlanByTechnologyName(@Param("technologyName") String technologyName,@Param("offset") Integer offset,@Param("rows") Integer rows);

    int deleteBatchTechnologyPlanByIds(String[] ids);

    List <TechnologyPlan> findAllTechnologyPlan();
}