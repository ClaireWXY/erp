package com.cskaoyan.service.impl;

import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.mapper.TechnologyPlanMapper;
import com.cskaoyan.service.TechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */
@Service("TechnologyPlanService")
public class TechnologyPlanServiceImpl implements TechnologyPlanService {
    @Autowired
    TechnologyPlanMapper technologyPlanMapper;

    @Override
    public List<TechnologyPlan> queryAllTechnologyPlan(Integer page, Integer rows) {
        List<TechnologyPlan> technologyPlans = technologyPlanMapper.queryAllTechnologyPlan((page - 1) * rows, rows);
        return technologyPlans;
    }

    @Override
    public List<TechnologyPlan> searchTechnologyPlanByTechnologyPlanId(String technologyPlanId, Integer page, Integer rows) {
        List<TechnologyPlan> technologyPlans = technologyPlanMapper.searchTechnologyPlanByTechnologyPlanId(technologyPlanId, (page - 1) * rows, rows);
        return technologyPlans;
    }

    @Override
    public int countByTechnologyName(String technologyName) {
        int count = technologyPlanMapper.countByTechnologyName(technologyName);
        return count;
    }

    @Override
    public List<TechnologyPlan> searchTechnologyRequirementByTechnologyName(String technologyName, Integer page, Integer rows) {
        List<TechnologyPlan> technologyPlans = technologyPlanMapper.searchTechnologyPlanByTechnologyName(technologyName, page, rows);
        return technologyPlans;
    }

    @Override
    public boolean addTechnologyPlan(TechnologyPlan technologyPlan) {
        int insert = technologyPlanMapper.insert(technologyPlan);
        return insert==1;
    }

    @Override
    public boolean editTechnologyPlan(TechnologyPlan technologyPlan) {
        int i = technologyPlanMapper.updateByPrimaryKeySelective(technologyPlan);
        return i==1;
    }

    @Override
    public boolean deleteBatchTechnologyPlan(String[] ids) {
        int i = technologyPlanMapper.deleteBatchTechnologyPlanByIds(ids);
        return i==1;
    }

    @Override
    public TechnologyPlan queryTechnologyPlanById(String id) {
        TechnologyPlan technologyPlan = technologyPlanMapper.selectByPrimaryKey(id);
        return technologyPlan;
    }

    @Override
    public List<TechnologyPlan> getData() {
        List<TechnologyPlan> allTechnologyPlan = technologyPlanMapper.findAllTechnologyPlan();
        return allTechnologyPlan;
    }

}
