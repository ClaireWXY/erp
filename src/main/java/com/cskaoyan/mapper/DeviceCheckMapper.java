package com.cskaoyan.mapper;


import com.cskaoyan.bean.DeviceCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DeviceCheckMapper {
    int deleteByPrimaryKey(String deviceCheckId);

    int insert(DeviceCheck record);

    int insertSelective(DeviceCheck record);

    DeviceCheck selectByPrimaryKey(String deviceCheckId);

    int updateByPrimaryKeySelective(DeviceCheck record);

    int updateByPrimaryKey(DeviceCheck record);


    List<DeviceCheck> queryAllDeviceCheck(@Param("offset") Integer offset, @Param("rows") Integer rows);

    List<DeviceCheck> searchDeviceCheckByDeviceCheckId(@Param("deviceCheckId") String deviceCheckId,@Param("offset") Integer offset,@Param("rows") Integer rows);

    List<DeviceCheck> searchDeviceCheckByDeviceCheckName(@Param("deviceCheckName") String deviceCheckName,@Param("offset") Integer offset,@Param("rows") Integer rows);
}