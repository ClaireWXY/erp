package com.cskaoyan.service;

import com.cskaoyan.bean.Process;
import com.cskaoyan.bean.TechnologyPlan;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */
public interface ProcessService {
    Integer countProcess();
    List<Process> queryAllProcess(Integer page, Integer rows);
    List<Process> searchProcessByProcessId(String processId,Integer page,Integer rows);
    int countByTechnologyPlanId(String technologyPlanId);
    List<Process> searchProcessByTechnologyPlanId(String technologyPlanId,Integer page,Integer rows);
    boolean addProcess(Process process);
    boolean editProcess(Process process);
    boolean deleteBatchProcess(String[] ids);
    Process queryProcessById(String id);
    List<Process> getData();
}
