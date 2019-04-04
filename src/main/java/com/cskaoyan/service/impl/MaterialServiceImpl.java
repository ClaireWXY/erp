package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Material;
import com.cskaoyan.mapper.MaterialMapper;
import com.cskaoyan.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialMapper materialMapper;

    /**
     * 查找所有的material
     * @return
     */
    @Override
    public List<Material> selectAllMaterial() {
        List<Material> materialList = materialMapper.selectAllMaterial();
        return materialList;
    }

    /**
     * 查找分页的material
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Material> selectPageMaterial(int limit, int offset) {
        List<Material> materialList = materialMapper.selectPageMaterial(limit, offset);
        return materialList;
    }

    /**
     * 添加一条material记录
     * @param material
     * @return
     */
    @Override
    public int insertOneMaterial(Material material) {
        int insert = materialMapper.insert(material);
        return insert;
    }

    /**
     * 修改material
     * @param material
     * @return
     */
    @Override
    public int updateMaterial(Material material) {
        int i = materialMapper.updateByPrimaryKey(material);
        return i;
    }

    /**
     * 删除一条material记录
     * @param id
     * @return
     */
    @Override
    public int deleteOneMaterial(String id) {
        int i = materialMapper.deleteByPrimaryKey(id);
        return i;
    }

    /**
     * 按id来查找material
     * @param materialId
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Material>  selectSearchPageMaterialById(String materialId, int limit, int offset) {
        List<Material>  material = materialMapper.selectPageMaterialById(materialId, limit, offset);
        return material;
    }

    /**
     * 按照类型查找material
     * @param materialType
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<Material> selectSearchPageMaterialByType(String materialType, int limit, int offset) {
        List<Material> materialList = materialMapper.selectPageMaterialByType(materialType,limit,offset);
        return materialList;
    }
}
