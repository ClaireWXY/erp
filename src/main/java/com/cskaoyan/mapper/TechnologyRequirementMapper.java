package com.cskaoyan.mapper;


import com.cskaoyan.bean.TechnologyRequirement;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyRequirementMapper {
    int deleteByPrimaryKey(String technologyRequirementId);

    int insert(TechnologyRequirement record);

    int insertSelective(TechnologyRequirement record);

    TechnologyRequirement selectByPrimaryKey(String technologyRequirementId);

    int updateByPrimaryKeySelective(TechnologyRequirement record);

    int updateByPrimaryKey(TechnologyRequirement record);

    int count();//查询所有值

    List<TechnologyRequirement> queryAllTechnologyRequirement(@Param("offset") Integer offset, @Param("rows") Integer rows);

    List<TechnologyRequirement> searchTechnologyRequirementByTechnologyRequirementId(@Param("technologyRequirementId") String technologyRequirementId, @Param("offset") Integer offset, @Param("rows") Integer rows);

    int countByTechnologyName(@Param("technologyName") String technologyName );

    List<TechnologyRequirement> searchTechnologyRequirementByTechnologyName(@Param("technologyName") String technologyName,@Param("offset") Integer offset,@Param("rows") Integer rows);

    int deleteBatchTechnologyRequirementByIds(String[] ids);

}