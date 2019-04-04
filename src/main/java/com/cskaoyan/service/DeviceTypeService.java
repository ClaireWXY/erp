package com.cskaoyan.service;

import com.cskaoyan.bean.DeviceType;
import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 11:07
 */
public interface DeviceTypeService
{
    /**
     * 查询设备种类
     * @return
     */
    List<DeviceType> queryDeviceTypeList(Integer page, Integer rows);
}
