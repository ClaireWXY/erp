package com.cskaoyan.service;

import com.cskaoyan.bean.MaterialConsume;
import com.cskaoyan.bean.MaterialReceive;

import java.util.List;

/**
 * Created by Fancy on 2019/4/5
 */
public interface MaterialConsumeService {
    List<MaterialConsume> selectPageMaterialConsume(int limit, int offset);

    int insertOneMaterialConsume(MaterialConsume materialConsume);

    int updateMaterialConsume(MaterialConsume materialConsume);

    int deleteOneMaterialConsume(String id);

    List<MaterialReceive> selectSearchPageMaterialConsumeByConsumeId(String searchValue, int limit, int offset);

    List<MaterialReceive> selectSearchPageMaterialConsumeByMaterialId(String searchValue, int limit, int offset);

    List<MaterialReceive> selectSearchPageMaterialConsumeByWorkId(String searchValue, int limit, int offset);

    int updateMaterialConsumeNoteById(String consumeId, String note);

}
