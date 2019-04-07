package com.cskaoyan.service;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.TotalAndList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/06 15:07
 */
public interface DeviceListService
{
    /**
     * 查询设备
     *
     * @return
     */
    TotalAndList queryAllDeviceList(Integer page, Integer rows);


    //获取总记录数
    int queryCountsDeviceList();

    //添加设备
    boolean addDevice(Device record);

    //编辑设备
    boolean updateDevice(Device record);

    //删除设备
    boolean deleteDevice(String[]  ids);




    /*/**
     * 根据id删除选中的设备
     *
     * @param ids
     * @return
     *//*
    boolean deleteBatchDeviceTypeByIds(String[] ids);

    *//**
 * 根据id编辑选中的设备
 *
 * @param record
 * @return
 *//*
    boolean updateByPrimaryKey(DeviceType record);



    *//**
 * 根据设备编号搜索设备
 *
 * @param searchValue
 * @param page
 * @param rows
 * @return
 *//*
    List<DeviceType> searchDeviceTypeByDeviceTypeId(@Param("searchValue") String searchValue, @Param("page") Integer page, @Param("rows") Integer rows);

    *//**
 * 根据设备名称搜索设备
 *
 * @param searchValue
 * @param page
 * @param rows
 * @return
 *//*
    List<DeviceType> searchDeviceTypeByDeviceTypeName(@Param("searchValue") String searchValue, @Param("page") Integer page, @Param("rows") Integer rows);
*/
}
