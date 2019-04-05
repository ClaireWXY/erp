package com.cskaoyan.service;

import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.bean.TechnologyRequirement;


import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */
public interface TechnologyPlanService {
    List<TechnologyPlan> queryAllTechnologyPlan(Integer page, Integer rows);
    List<TechnologyPlan> searchTechnologyPlanByTechnologyPlanId(String technologyPlanId,Integer page,Integer rows);
    int countByTechnologyName(String technologyName );
    List<TechnologyPlan> searchTechnologyRequirementByTechnologyName(String technologyPlanId,Integer page,Integer rows);
    boolean addTechnologyPlan(TechnologyPlan technologyPlan);
    boolean editTechnologyPlan(TechnologyPlan technologyPlan);
    boolean deleteBatchTechnologyPlan(String[] ids);





}
