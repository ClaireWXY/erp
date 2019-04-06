package com.cskaoyan.service;

import com.cskaoyan.bean.MaterialReceive;

import java.util.List;

public interface MaterialReceiveService {

    //分页显示所有的materialReceive
    List<MaterialReceive> selectPageMaterialReceive(int limit, int offset);

    //插入一条materialReceive记录
    int insertOneMaterialReceive(MaterialReceive materialReceive);

    int updateMaterialReceive(MaterialReceive materialReceive);

    int deleteOneMaterialReceive(String id);

    List<MaterialReceive> selectSearchPageMaterialReceiveByReceiveId(String receiveId, int limit, int offset);

    List<MaterialReceive> selectSearchPageMaterialReceiveByMaterialId(String materialId, int limit, int offset);

    int updateMaterialReceiveNoteById(String receiveId, String note);



}
