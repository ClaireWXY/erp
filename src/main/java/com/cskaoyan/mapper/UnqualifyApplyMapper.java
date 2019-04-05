package com.cskaoyan.mapper;

import com.cskaoyan.bean.PageUnQualifyList;
import com.cskaoyan.bean.UnqualifyApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnqualifyApplyMapper {
    int deleteByPrimaryKey(String unqualifyApplyId);

    int insert(UnqualifyApply record);

    int insertSelective(UnqualifyApply record);

    UnqualifyApply selectByPrimaryKey(String unqualifyApplyId);

    int updateByPrimaryKeySelective(UnqualifyApply record);

    int updateByPrimaryKey(UnqualifyApply record);

    int UnqualifyCount();


    List<PageUnQualifyList> findPageUnQualifyList(@Param("page") int page , @Param("rows") int rows);

    List<PageUnQualifyList> findPageUnQualifyListById(@Param("id") String searchValue,@Param("page") int page , @Param("rows") int rows);

    int UnqualifyCountById(@Param("id") String searchValue);

    List<PageUnQualifyList> findPageUnQualifyListByProductName(@Param("productName") String searchValue,@Param("page") int page , @Param("rows") int rows);

    int UnqualifyCountByProductName(@Param("productName") String searchValue);
}