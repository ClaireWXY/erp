package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Process;
import com.cskaoyan.mapper.ProcessMapper;
import com.cskaoyan.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */
@Service("ProcessService")
public class ProcessServiceImpl implements ProcessService {
    @Autowired
    ProcessMapper processMapper;

    @Override
    public Integer countProcess() {
        Integer count = processMapper.countProcess();
        return count;
    }

    @Override
    public List<Process> queryAllProcess(Integer page, Integer rows) {
        List<Process> processes = processMapper.queryAllProcess((page - 1) * rows, rows);
        return processes;
    }

    @Override
    public List<Process> searchProcessByProcessId(String processId, Integer page, Integer rows) {
        List<Process> processes = processMapper.searchProcessByProcessId(processId, (page - 1) * rows, rows);
        return processes;
    }

    @Override
    public int countByTechnologyPlanId(String technologyPlanId) {
        int count = processMapper.countByTechnologyPlanId(technologyPlanId);
        return count;
    }

    @Override
    public List<Process> searchProcessByTechnologyPlanId(String technologyPlanId, Integer page, Integer rows) {
        List<Process> processes = processMapper.searchProcessByTechnologyPlanId(technologyPlanId, (page - 1) * rows, rows);
        return processes;
    }

    @Override
    public boolean addProcess(Process process) {
        int insert = processMapper.insert(process);
        return insert==1;
    }

    @Override
    public boolean editProcess(Process process) {
        int i = processMapper.updateByPrimaryKeySelective(process);
        return i==1;
    }

    @Override
    public boolean deleteBatchProcess(String[] ids) {
        int i = processMapper.deleteBatchProcessByIds(ids);
        return i==1;
    }

    @Override
    public Process queryProcessById(String id) {
        Process process = processMapper.selectByPrimaryKey(id);
        return process;
    }

    @Override
    public List<Process> getData() {
        List<Process> processes = processMapper.findAllProcess();
        return processes;
    }
}
