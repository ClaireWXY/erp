package com.cskaoyan.mapper;


import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.PageMasureList;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

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

    List<PageMasureList> findPageMeasureListById(@Param("id") String searchValue, @Param("page") int page, @Param("rows")int rows);
    int measureCountById(@Param("id") String searchValue);

    List<PageMasureList> findPageMeasureListByOrderId(@Param("orderId") String searchValue, @Param("page") int page, @Param("rows")int rows);
    int measureCountByOrderId(@Param("orderId") String searchValue);
}