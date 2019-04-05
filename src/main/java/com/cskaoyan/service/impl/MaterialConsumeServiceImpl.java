package com.cskaoyan.service.impl;

import com.cskaoyan.bean.MaterialConsume;
import com.cskaoyan.bean.MaterialReceive;
import com.cskaoyan.mapper.MaterialConsumeMapper;
import com.cskaoyan.service.MaterialConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fancy on 2019/4/5
 */

@Service
public class MaterialConsumeServiceImpl implements MaterialConsumeService {
    @Autowired
    MaterialConsumeMapper materialConsumeMapper;

    /**
     * 分页显示materialConsume
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<MaterialConsume> selectPageMaterialConsume(int limit, int offset) {
        List<MaterialConsume> materialConsumeList = materialConsumeMapper.selectPageMaterialConsume(limit,offset);
        return materialConsumeList;
    }

    /**
     * 添加一条materialConsume记录
     * @param materialConsume
     * @return
     */
    @Override
    public int insertOneMaterialConsume(MaterialConsume materialConsume) {
        int insert = materialConsumeMapper.insert(materialConsume);
        return insert;
    }

    /**
     * 修改materialConsume记录
     * @param materialConsume
     * @return
     */
    @Override
    public int updateMaterialConsume(MaterialConsume materialConsume) {
        int i = materialConsumeMapper.updateByPrimaryKey(materialConsume);
        return i;
    }

    /**
     * 删除id对应的记录
     * @param id
     * @return
     */
    @Override
    public int deleteOneMaterialConsume(String id) {
        int i = materialConsumeMapper.deleteByPrimaryKey(id);
        return i;
    }

    /**
     *
     * 按consumeId查找
     * @param consume_id
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<MaterialReceive> selectSearchPageMaterialConsumeByConsumeId(String consume_id, int limit, int offset) {
        List<MaterialReceive> materialReceiveList = materialConsumeMapper.selectSearchPageMaterialConsumeByConsumeId(consume_id,limit,offset);
        return materialReceiveList;
    }

    /**
     * 按materialId查找
     * @param material_id
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<MaterialReceive> selectSearchPageMaterialConsumeByMaterialId(String material_id, int limit, int offset) {
        List<MaterialReceive> materialReceiveList = materialConsumeMapper.selectSearchPageMaterialConsumeByMaterialId(material_id,limit,offset);
        return materialReceiveList;
    }

    /**
     * 按work_id查找
     * @param work_id
     * @param limit
     * @param offset
     * @return
     */
    @Override
    public List<MaterialReceive> selectSearchPageMaterialConsumeByWorkId(String work_id, int limit, int offset) {
        List<MaterialReceive> materialReceiveList = materialConsumeMapper.selectSearchPageMaterialConsumeByWorkId(work_id,limit,offset);
        return materialReceiveList;
    }

    @Override
    public int updateMaterialConsumeNoteById(String consume_id, String note) {
        int i = materialConsumeMapper.updateMaterialConsumeNoteById(consume_id,note);
        return i;
    }
}
