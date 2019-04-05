package com.cskaoyan.service.impl;

import com.cskaoyan.bean.DeviceCheck;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.mapper.DeviceCheckMapper;
import com.cskaoyan.mapper.DeviceTypeMapper;
import com.cskaoyan.service.DeviceCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 11:03
 */
@Service
public class DeviceCheckServiceImpl implements DeviceCheckService
{
    @Autowired
    private DeviceCheckMapper deviceCheckMapper;

    /**
     * 查询所有设备例检
     * @param page
     * @param rows
     * @return
     */
    @Override
    public List<DeviceCheck> queryAllDeviceCheck(Integer page, Integer rows)
    {
        List<DeviceCheck> deviceChecks = this.deviceCheckMapper.queryAllDeviceCheck((page - 1) * rows, rows);
        return deviceChecks;
    }

    @Override
    public List<DeviceCheck> searchDeviceCheckByDeviceCheckId(String deviceCheckId, Integer offset, Integer rows)
    {
        return null;
    }

    @Override
    public List<DeviceCheck> searchDeviceCheckByDeviceCheckName(String deviceCheckName, Integer offset, Integer rows)
    {
        return null;
    }
}
