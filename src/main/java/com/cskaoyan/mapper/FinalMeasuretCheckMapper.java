package com.cskaoyan.mapper;


import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.PageMasureList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinalMeasuretCheckMapper {
    int deleteByPrimaryKey(String fMeasureCheckId);

    int insert(FinalMeasuretCheck record);

    int insertSelective(FinalMeasuretCheck record);

    FinalMeasuretCheck selectByPrimaryKey(String fMeasureCheckId);

    int updateByPrimaryKeySelective(FinalMeasuretCheck record);

    int updateByPrimaryKey(FinalMeasuretCheck record);

    List<PageMasureList> findPageMeasureList(@Param("page") int page, @Param("rows")int rows);
    int measureCount();
}