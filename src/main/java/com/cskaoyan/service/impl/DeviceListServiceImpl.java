package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.mapper.DeviceMapper;
import com.cskaoyan.service.DeviceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/06 15:07
 */
@Service
public class DeviceListServiceImpl implements DeviceListService
{
    @Autowired
    private DeviceMapper deviceMapper;

    /**
     * 分页查询所有设备种类
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public TotalAndList queryAllDeviceList(Integer page, Integer rows)
    {
        //返回查询数据
        List<Device> devices = this.deviceMapper.queryAllDeviceList((page - 1) * rows, rows);
        //返回查询总记录数
        int counts = deviceMapper.queryCountsDeviceList();
        TotalAndList totalAndList = new TotalAndList(counts, devices);
        return totalAndList;
    }
    /*
 * 添加设备种类
 * 删除选中的设备种类
 * 根据id编辑选中的设备种类
 * 根据设备编号搜索设备种类
   根据设备名称搜索设备种类
    }*/


    //获取总记录数
    @Override
    public int queryCountsDeviceList()
    {
        int counts = deviceMapper.queryCountsDeviceList();
        return counts;
    }

    //添加设备
    @Override
    public boolean addDevice(Device device)
    {
        int insert = deviceMapper.insert(device);
        return insert == 1;
    }

    //编辑设备
    @Override
    public boolean updateDevice(Device record)
    {
        int i = deviceMapper.updateByPrimaryKey(record);
        return i == 1;
    }

    @Override
    public boolean deleteDevice(String[]  ids)
    {
        int i = deviceMapper.deleteByPrimaryKey(ids);
        return i == 1;
    }

    //删除设备


}
