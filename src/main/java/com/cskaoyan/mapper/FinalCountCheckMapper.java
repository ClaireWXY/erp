package com.cskaoyan.mapper;


import com.cskaoyan.bean.FinalCountCheck;
import com.cskaoyan.bean.PageFinalCountList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinalCountCheckMapper {
    int deleteByPrimaryKey(String fCountCheckId);

    int insert(FinalCountCheck record);

    int insertSelective(FinalCountCheck record);

    FinalCountCheck selectByPrimaryKey(String fCountCheckId);

    int updateByPrimaryKeySelective(FinalCountCheck record);

    int updateByPrimaryKey(FinalCountCheck record);

    List<PageFinalCountList> findPageFinalCountList(@Param("page") int page, @Param("rows") int rows);

    int finalCountCheckCount();

    List<PageFinalCountList> findPageFinalCountListById(@Param("id") String searchValue,@Param("page") int page, @Param("rows") int rows);

    int finalCountCheckCountById(@Param("id") String searchValue);

    List<PageFinalCountList> findPageFinalCountListByOrderId(@Param("orderId") String searchValue,@Param("page") int page, @Param("rows") int rows);

    int finalCountCheckCountByOrderId(@Param("orderId") String searchValue);
}