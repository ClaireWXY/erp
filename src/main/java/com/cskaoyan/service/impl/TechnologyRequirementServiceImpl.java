package com.cskaoyan.service.impl;

import com.cskaoyan.bean.TechnologyRequirement;
import com.cskaoyan.mapper.TechnologyRequirementMapper;
import com.cskaoyan.service.TechnologyRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
@Service("TechnologyRequirementService")
public class TechnologyRequirementServiceImpl implements TechnologyRequirementService {
    @Autowired
    TechnologyRequirementMapper technologyRequirementMapper;

    @Override
    public List<TechnologyRequirement> queryAllTechnologyRequirement(Integer page,Integer rows) {
        List<TechnologyRequirement> technologyRequirements = technologyRequirementMapper.queryAllTechnologyRequirement((page - 1) * rows, rows);
        return technologyRequirements;
    }

    @Override
    public List<TechnologyRequirement> searchTechnologyRequirementByTechnologyRequirementId(String technologyRequirementId, Integer page, Integer rows) {
        List<TechnologyRequirement> technologyRequirements = technologyRequirementMapper.searchTechnologyRequirementByTechnologyRequirementId(technologyRequirementId, (page - 1) * rows, rows);
        return technologyRequirements;
    }

    @Override
    public List<TechnologyRequirement> searchTechnologyRequirementByTechnologyName(String technologyName, Integer page, Integer rows) {
        List<TechnologyRequirement> technologyRequirements = technologyRequirementMapper.searchTechnologyRequirementByTechnologyName(technologyName, (page - 1) * rows, rows);
        return technologyRequirements;
    }

    @Override
    public int countByTechnologyName(String technologyName ) {
        int count = technologyRequirementMapper.countByTechnologyName(technologyName);
        return count;
    }

    @Override
    public boolean addTechnologyRequirement(TechnologyRequirement technologyRequirement) {
        int insert = technologyRequirementMapper.insert(technologyRequirement);
        return insert==1;
    }

    @Override
    public boolean editTechnologyRequirement(TechnologyRequirement technologyRequirement) {
        int updateByPrimaryKey = technologyRequirementMapper.updateByPrimaryKeySelective(technologyRequirement);
        return updateByPrimaryKey==1;
    }

    @Override
    public boolean deleteBatchTechnologyRequirement(String[] ids) {
        int deleteBatchTechnologyRequirementByIds = technologyRequirementMapper.deleteBatchTechnologyRequirementByIds(ids);
        return deleteBatchTechnologyRequirementByIds==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(TechnologyRequirement technologyRequirement) {
        int updateByPrimaryKeySelective = technologyRequirementMapper.updateByPrimaryKeySelective(technologyRequirement);
        return updateByPrimaryKeySelective==1;
    }
}
