package com.cskaoyan.service;

import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.TotalAndList;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 11:07
 */
public interface DeviceTypeService
{
    /**
     * 查询设备种类
     *
     * @return
     */
    TotalAndList queryDeviceTypeList(Integer page, Integer rows);

    /**
     * 添加设备种类
     *
     * @return
     */
    boolean addDeviceType(DeviceType deviceType);

    /**
     * 根据id删除选中的设备种类
     *
     * @param ids
     * @return
     */
    boolean deleteBatchDeviceTypeByIds(String[] ids);

    /**
     * 根据id编辑选中的设备种类
     *
     * @param record
     * @return
     */
    boolean updateByPrimaryKey(DeviceType record);

    List<DeviceType> queryDeviceTypeByPageAndSelections();

    /**
     * 获取总记录数
     * @return
     */
    int deviceTypeCount();

}
