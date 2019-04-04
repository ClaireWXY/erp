package com.cskaoyan.service.impl;

import com.cskaoyan.bean.PageUnQualifyList;
import com.cskaoyan.bean.UnqualifyApplyVo;
import com.cskaoyan.mapper.UnqualifyApplyMapper;
import com.cskaoyan.service.QualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("QualifyService")
public class QualifyerviceImpl implements QualifyService {
    @Autowired
    UnqualifyApplyMapper unqualifyApplyMapper;

    @Override
    public UnqualifyApplyVo findUnqualifyCount(int page, int rows) {
        int i = unqualifyApplyMapper.UnqualifyCount();
        List<PageUnQualifyList> pageUnQualifyList = unqualifyApplyMapper.findPageUnQualifyList((page - 1) * rows, rows);
        UnqualifyApplyVo unqualifyApplyVo = new UnqualifyApplyVo();
        unqualifyApplyVo.setTotal(i);
        unqualifyApplyVo.setRows(pageUnQualifyList);
        return unqualifyApplyVo;
    }


}
