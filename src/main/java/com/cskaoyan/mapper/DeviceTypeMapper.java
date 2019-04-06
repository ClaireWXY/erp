package com.cskaoyan.mapper;

import com.cskaoyan.bean.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTypeMapper {
    int deleteByPrimaryKey(String[] deviceTypeId);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    DeviceType selectByPrimaryKey(String deviceTypeId);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKey(DeviceType record);

    List<DeviceType> queryAllDeviceType(@Param("offset") Integer offset, @Param("rows") Integer rows);

    List<DeviceType> searchDeviceTypeByDeviceTypeId(@Param("deviceTypeId") String deviceTypeId,@Param("offset") Integer offset,@Param("rows") Integer rows);

    List<DeviceType> searchDeviceTypeByDeviceTypeName(@Param("deviceTypeName") String deviceTypeName, @Param("offset") Integer offset, @Param("rows") Integer rows);

    int deleteBatchDeviceTypeByIds(String[] ids);

    List<DeviceType> queryDeviceType_data();

    int deviceTypeCount();

}