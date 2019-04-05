package com.cskaoyan.service;

import com.cskaoyan.bean.DeviceCheck;
import com.cskaoyan.bean.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 11:02
 */
public interface DeviceCheckService
{
    List<DeviceCheck> queryAllDeviceCheck(Integer page, Integer rows);

    List<DeviceCheck> searchDeviceCheckByDeviceCheckId(String deviceCheckId, Integer offset, Integer rows);

    List<DeviceCheck> searchDeviceCheckByDeviceCheckName(String deviceCheckName, Integer offset, Integer rows);
}
