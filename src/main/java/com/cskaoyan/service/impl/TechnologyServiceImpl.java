package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.mapper.TechnologyMapper;
import com.cskaoyan.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Service("TechnologyService")
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    TechnologyMapper technologyMapper;

    @Override
    public List<Technology> queryAllTechnology(Integer page, Integer rows) {
        List<Technology> technologies = technologyMapper.queryAllTechnology((page - 1) * rows, rows);
        return technologies;
    }

    @Override
    public List<Technology> searchTechnologyByTechnologyId(String technologyId,Integer page,Integer rows) {
        List<Technology> technologies = technologyMapper.searchTechnologyByTechnologyId(technologyId, (page - 1) * rows, rows);
        return technologies;
    }

    @Override
    public List<Technology> searchTeachnologyByTechnologyName(String technologyName, Integer page, Integer rows) {
        List<Technology> technologies = technologyMapper.searchTeachnologyByTechnologyName(technologyName, (page - 1) * rows, rows);
        return technologies;
    }

    @Override
    public boolean addTechnology(Technology technology) {
        int insert = technologyMapper.insert(technology);
        return insert==1;
    }

    @Override
    public boolean editTechnology(Technology technology) {
        int updateByPrimaryKey = technologyMapper.updateByPrimaryKey(technology);
        return updateByPrimaryKey==1;
    }
}
