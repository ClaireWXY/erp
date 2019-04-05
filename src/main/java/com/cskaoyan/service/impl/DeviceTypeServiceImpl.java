package com.cskaoyan.service.impl;

import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.Technology;
import com.cskaoyan.mapper.DeviceTypeMapper;
import com.cskaoyan.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 11:07
 */
@Service
public class DeviceTypeServiceImpl implements DeviceTypeService
{
    @Autowired
    private DeviceTypeMapper deviceTypeMapper;

    /**
     * 查询所有设备种类
     * @param page
     * @param rows
     * @return
     */
    @Override
    public List<DeviceType> queryDeviceTypeList(Integer page, Integer rows)
    {
       // DeviceType deviceType = this.deviceTypeMapper.selectByPrimaryKey("device_type_id");
        List<DeviceType> deviceTypes = this.deviceTypeMapper.queryAllDeviceType((page - 1) * rows, rows);
        return deviceTypes;
    }

    /**
     * 添加设备种类
     * @param deviceType
     * @return
     */
    @Override
    public boolean addDeviceType(DeviceType deviceType)
    {
        int insert = deviceTypeMapper.insert(deviceType);
        return insert==1;
    }
}
