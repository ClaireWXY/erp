package com.cskaoyan.mapper;

import com.cskaoyan.bean.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(@Param("id")String[] ids);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String deviceId);

    List<Device> queryAllDeviceList(@Param("offset") Integer offset,@Param("rows") Integer rows);

    int queryCountsDeviceList();

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);


}