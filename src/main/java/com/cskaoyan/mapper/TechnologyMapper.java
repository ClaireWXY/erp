package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyMapper {
    int deleteByPrimaryKey(String technologyId);

    int insert(Technology record);

    int insertSelective(Technology record);

    Technology selectByPrimaryKey(String technologyId);

    int updateByPrimaryKeySelective(Technology record);

    int updateByPrimaryKey(Technology record);

    List<Technology> queryAllTechnology(@Param("offset") Integer offset,@Param("rows") Integer rows);

    List<Technology> searchTechnologyByTechnologyId(@Param("technologyId") String technologyId,@Param("offset") Integer offset,@Param("rows") Integer rows);

    List<Technology> searchTeachnologyByTechnologyName(@Param("technologyName") String technologyName,@Param("offset") Integer offset,@Param("rows") Integer rows);

    int deleteBatchTechnologyByIds(String[] ids);

}