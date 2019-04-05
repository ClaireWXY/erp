package com.cskaoyan.mapper;


import com.cskaoyan.bean.Material;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialMapper {

    List<Material> selectAllMaterial();

    List<Material> selectPageMaterial(@Param("limit") int limit, @Param("offset") int offset);

    int deleteByPrimaryKey(String materialId);

    //添加一条material记录
    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(String materialId);

    int updateByPrimaryKeySelective(Material record);
    //修改一条material记录
    int updateByPrimaryKey(Material record);

    List<Material>  selectPageMaterialById(@Param("materialId")String materialId, @Param("limit")int limit, @Param("offset")int offset);

    List<Material> selectPageMaterialByType(@Param("materialType") String materialType, @Param("limit") int limit, @Param("offset") int offset);

    int updateMaterialNoteById(@Param("materialId")String materialId, @Param("note")String note);
}