package com.cskaoyan.service.impl;


import com.cskaoyan.bean.MaterialReceive;
import com.cskaoyan.mapper.MaterialReceiveMapper;
import com.cskaoyan.service.MaterialReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialReceiveServiceImpl implements MaterialReceiveService {

    @Autowired
    MaterialReceiveMapper materialReceiveMapper;
    @Override
    public List<MaterialReceive> selectPageMaterialReceive(int limit, int offset) {
        List<MaterialReceive> materialReceiveList = materialReceiveMapper.selectPageMaterialReceive(limit,offset);
        return materialReceiveList;
    }

    @Override
    public int insertOneMaterialReceive(MaterialReceive materialReceive) {
        int insert = materialReceiveMapper.insert(materialReceive);
        return insert;
    }

    @Override
    public int updateMaterialReceive(MaterialReceive materialReceive) {
        int i = materialReceiveMapper.updateByPrimaryKey(materialReceive);
        return i;
    }

    @Override
    public int deleteOneMaterialReceive(String id) {
        int i = materialReceiveMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public List<MaterialReceive> selectSearchPageMaterialReceiveByReceiveId(String receiveId, int limit, int offset) {
        List<MaterialReceive> materialReceiveList= materialReceiveMapper.selectPageMaterialReceiveByReceiveId(receiveId,limit,offset);
        return materialReceiveList;
    }

    @Override
    public List<MaterialReceive> selectSearchPageMaterialReceiveByMaterialId(String materialId, int limit, int offset) {
        List<MaterialReceive> materialReceiveList = materialReceiveMapper.selectPageMaterialReceiveByMaterialId(materialId,limit,offset);
        return materialReceiveList;
    }

  /*  @Override
    public int updateMaterialReceiveNote(String note) {
        materialReceiveMapper.updateByNote()
        return 0;
    }*/
}
