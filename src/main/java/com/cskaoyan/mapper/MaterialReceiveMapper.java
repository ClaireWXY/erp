package com.cskaoyan.mapper;


import com.cskaoyan.bean.MaterialReceive;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MaterialReceiveMapper {
    int deleteByPrimaryKey(String receiveId);

    int insert(MaterialReceive record);

    int insertSelective(MaterialReceive record);

    MaterialReceive selectByPrimaryKey(String receiveId);

    int updateByPrimaryKeySelective(MaterialReceive record);

    int updateByPrimaryKey(MaterialReceive record);

    List<MaterialReceive> selectPageMaterialReceive(@Param("limit") int limit, @Param("offset") int offset);

    List<MaterialReceive> selectPageMaterialReceiveByReceiveId(@Param("receiveId") String receiveId, @Param("limit")int limit, @Param("offset")int offset);

    List<MaterialReceive> selectPageMaterialReceiveByMaterialId(@Param("materialId")String materialId, @Param("limit")int limit,  @Param("offset")int offset);

    int updateMaterialReceiveNoteById(@Param("materialReceive")MaterialReceive materialReceive);
}