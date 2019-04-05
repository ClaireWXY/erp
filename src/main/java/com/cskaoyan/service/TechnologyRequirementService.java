package com.cskaoyan.service;

import com.cskaoyan.bean.Technology;
import com.cskaoyan.bean.TechnologyRequirement;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
public interface TechnologyRequirementService {

    List<TechnologyRequirement> queryAllTechnologyRequirement(Integer page, Integer rows);

    List<TechnologyRequirement> searchTechnologyRequirementByTechnologyRequirementId(String technologyRequirementId,Integer page,Integer rows);

    int countByTechnologyName(String technologyName );

    List<TechnologyRequirement> searchTechnologyRequirementByTechnologyName(String technologyName,Integer page,Integer rows);

    boolean addTechnologyRequirement(TechnologyRequirement technologyRequirement);

    boolean editTechnologyRequirement(TechnologyRequirement technologyRequirement);

    boolean deleteBatchTechnologyRequirement(String[] ids);

    boolean updateByPrimaryKeySelective(TechnologyRequirement technologyRequirement);
}
