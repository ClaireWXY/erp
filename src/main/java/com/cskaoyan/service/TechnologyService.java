package com.cskaoyan.service;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */

import com.cskaoyan.bean.Technology;

import java.util.List;

/**
 * Technology的service接口
 */
public interface TechnologyService {
   List<Technology> queryAllTechnology(Integer page,Integer rows);
   List<Technology> searchTechnologyByTechnologyId(String technologyId,Integer page,Integer rows);
   List<Technology> searchTeachnologyByTechnologyName(String technologyName,Integer page,Integer rows);
   boolean addTechnology(Technology technology);
}
