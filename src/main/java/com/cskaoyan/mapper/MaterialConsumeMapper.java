package com.cskaoyan.mapper;

import com.cskaoyan.bean.MaterialConsume;
import com.cskaoyan.bean.MaterialReceive;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialConsumeMapper {
    int deleteByPrimaryKey(String consumeId);

    int insert(MaterialConsume record);

    int insertSelective(MaterialConsume record);

    MaterialConsume selectByPrimaryKey(String consumeId);

    int updateByPrimaryKeySelective(MaterialConsume record);

    int updateByPrimaryKey(MaterialConsume record);

    List<MaterialConsume> selectPageMaterialConsume(int limit, int offset);

    List<MaterialReceive> selectSearchPageMaterialConsumeByConsumeId(@Param("consume_id") String consume_id, @Param("limit")int limit, @Param("offset")int offset);

    List<MaterialReceive> selectSearchPageMaterialConsumeByMaterialId(@Param("material_id") String material_id, @Param("limit")int limit, @Param("offset")int offset);

    List<MaterialReceive> selectSearchPageMaterialConsumeByWorkId(@Param("work_id") String work_id, @Param("limit")int limit, @Param("offset")int offset);

    int updateMaterialConsumeNoteById(@Param("materialConsume") MaterialConsume materialConsume);
}