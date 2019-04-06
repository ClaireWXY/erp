package com.cskaoyan.mapper;

import com.cskaoyan.bean.PagePCountCheckList;
import com.cskaoyan.bean.ProcessCountCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessCountCheckMapper {
    int deleteByPrimaryKey(String pCountCheckId);

    int insert(ProcessCountCheck record);

    int insertSelective(ProcessCountCheck record);

    ProcessCountCheck selectByPrimaryKey(String pCountCheckId);

    int updateByPrimaryKeySelective(ProcessCountCheck record);

    int updateByPrimaryKey(ProcessCountCheck record);

    List<PagePCountCheckList> findCountCheckList(@Param("page") int page, @Param("rows") int rows);

    int PCountCheckCount();

    List<PagePCountCheckList> findCountCheckListById(@Param("id")String searchValue,@Param("page")int page, @Param("rows")int rows);
    int PCountCheckCountById(@Param("id")String searchValue);

    int deleteProcessCountCheckByIds(@Param("array") String[] ids);
}