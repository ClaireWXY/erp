package com.cskaoyan.service.impl;

import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.DeviceTypeMapper;
import com.cskaoyan.service.DeviceTypeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
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
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public TotalAndList queryDeviceTypeList(Integer page, Integer rows)
    {
        //Page<Object> objects = PageHelper.startPage(page, rows);
        //返回查询数据
        List<DeviceType> deviceTypes = this.deviceTypeMapper.queryAllDeviceType((page - 1) * rows, rows);
        //返回查询总记录数
        int counts = deviceTypeMapper.deviceTypeCount();
        TotalAndList totalAndList = new TotalAndList(counts, deviceTypes);
        return totalAndList;
    }

    //获取设备种类数据
    @Override
    public List<DeviceType> queryDeviceType_data()
    {
        List<DeviceType> deviceTypes = deviceTypeMapper.queryDeviceType_data();
        return deviceTypes;
    }


    /**
     * 添加设备种类
     *
     * @param deviceType
     * @return
     */
    @Override
    public boolean addDeviceType(DeviceType deviceType)
    {
        int insert = deviceTypeMapper.insert(deviceType);
        return insert == 1;
    }

    /**
     * 删除选中的设备种类
     *
     * @param ids
     * @return
     */
    @Override
    public boolean deleteBatchDeviceTypeByIds(String[] ids)
    {
        int i = deviceTypeMapper.deleteBatchDeviceTypeByIds(ids);
        return i >= 1;
    }

    /**
     * 根据id编辑选中的设备种类
     *
     * @param record
     * @return
     */
    @Override
    public boolean updateByPrimaryKey(DeviceType record)
    {
        int i = deviceTypeMapper.updateByPrimaryKey(record);
        return i == 1;
    }


    /**
     * 获取总记录数
     *
     * @return
     */
    @Override
    public int deviceTypeCount()
    {
        int counts = deviceTypeMapper.deviceTypeCount();
        return counts;
    }

    /**
     * 根据设备编号搜索设备种类
     *
     * @param searchValue
     * @param page
     * @param rows
     * @return
     */
    @Override
    public List<DeviceType> searchDeviceTypeByDeviceTypeId(@Param("searchValue") String searchValue, @Param("page") Integer page, @Param("rows") Integer rows)
    {
        List<DeviceType> deviceTypes = deviceTypeMapper.searchDeviceTypeByDeviceTypeId(searchValue, (page - 1) * rows, rows);
        return deviceTypes;
    }

    @Override
    public List<DeviceType> searchDeviceTypeByDeviceTypeName(@Param("searchValue") String searchValue, @Param("page") Integer page, @Param("rows") Integer rows)
    {
        List<DeviceType> deviceTypes = deviceTypeMapper.searchDeviceTypeByDeviceTypeName(searchValue, (page - 1) * rows, rows);
        return deviceTypes;
    }
}
