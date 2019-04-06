package com.cskaoyan.mapper;


import com.cskaoyan.bean.PagePMeasureCheckList;
import com.cskaoyan.bean.ProcessMeasureCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessMeasureCheckMapper {
    int deleteByPrimaryKey(String pMeasureCheckId);

    int insert(ProcessMeasureCheck record);

    int insertSelective(ProcessMeasureCheck record);

    ProcessMeasureCheck selectByPrimaryKey(String pMeasureCheckId);

    int updateByPrimaryKeySelective(ProcessMeasureCheck record);

    int updateByPrimaryKey(ProcessMeasureCheck record);

    List<PagePMeasureCheckList> findPMeasureCheckList(@Param("page") int page, @Param("rows") int rows);

    int PMeasureCheckCount();


    List<PagePMeasureCheckList> findPMeasureCheckListById(@Param("id")String search,@Param("page") int page, @Param("rows") int rows);

    int PMeasureCheckCountById(@Param("id")String search);


    int deleteProcessMeasureCheckByIds(@Param("array") String[] ids);

}