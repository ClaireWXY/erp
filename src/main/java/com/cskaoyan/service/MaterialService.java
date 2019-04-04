package com.cskaoyan.service;

import com.cskaoyan.bean.Material;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
public interface MaterialService {

    //查找所有的material
    List<Material> selectAllMaterial();

    //查找分页的material
    List<Material> selectPageMaterial(int limit, int offset);

    //添加一条material数据
    int insertOneMaterial(Material material);

    //修改material数据
    int updateMaterial(Material material);

    int deleteOneMaterial(String id);

    List<Material> selectSearchPageMaterialById(String materialId, int limit, int offset);

    List<Material> selectSearchPageMaterialByType(String materialType, int limit, int offset);
}
