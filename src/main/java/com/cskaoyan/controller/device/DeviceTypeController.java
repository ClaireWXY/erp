package com.cskaoyan.controller.device;

import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.service.DeviceTypeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 09:37
 */
@Controller
//@RequestMapping("device")
public class DeviceTypeController
{
    @Autowired
    private DeviceTypeService deviceTypeService;

    @RequestMapping("*/*_judge")
    @ResponseBody
    public String judge() {
        return "";
    }

    @RequestMapping("deviceType/get_data")
    @ResponseBody
    public List<DeviceType> get_data()
    {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceType_data();

        return deviceTypes;
    }


    /**
     * 分页查询所有设备种类
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("device/deviceType")
    public String DeviceCheckForm(@Param("page") Integer page, @Param("rows") Integer rows)
    {
        return "deviceType";
    }

    @RequestMapping("deviceType/list")
    @ResponseBody
    public TotalAndList list(@Param("page") Integer page, @Param("rows") Integer rows)
    {
        TotalAndList totalAndList = deviceTypeService.queryDeviceTypeList(page, rows);
        return totalAndList;
    }

    /**
     * 添加一个设备种类
     * @param deviceType
     * @return
     */
    @RequestMapping("deviceType/add")
    public String add(@Param("deviceType") DeviceType deviceType)
    {
        return "deviceType_add";
    }

    @RequestMapping("deviceType/insert")
    @ResponseBody
    public Tip addDeviceType(DeviceType deviceType)
    {
        boolean addBoolean = deviceTypeService.addDeviceType(deviceType);
        if (addBoolean)
        {
            return new Tip("200", "新增设备种类成功!", null);
        }
        return new Tip("0", "添加失败。", null);
    }

    /**
     * 编辑一个设备种类
     * @param deviceType
     * @return
     */
    @RequestMapping("deviceType/edit")
    public String editDeviceType(@Param("deviceType") DeviceType deviceType)
    {
        return "deviceType_edit";
    }

    @RequestMapping("deviceType/update")
    @ResponseBody
    public Tip updateDeviceType(DeviceType deviceType)
    {
        boolean update = deviceTypeService.updateByPrimaryKey(deviceType);
        if (update)
        {
            return new Tip("200", "编辑设备种类成功!", null);
        }
        return new Tip("0", "添加失败。", null);
    }

    /**
     * 删除选中的设备种类
     * @param ids
     * @return
     */
    @RequestMapping("deviceType/delete_batch")
    @ResponseBody
    public Tip deleteDeviceType(@Param("ids") String[] ids)
    {
        boolean deleteByPrimaryKey = deviceTypeService.deleteBatchDeviceTypeByIds(ids);
        if (deleteByPrimaryKey)
        {
            return new Tip("200", "删除设备种类成功!", null);
        }
        return new Tip("0", "删除失败。", null);
    }

    /**
     * 根据设备编号进行搜索(未实现分页功能)（未实现模糊查找功能）
     * @param searchValue
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeId")
    @ResponseBody
    public List<DeviceType> searchDeviceTypeByDeviceTypeId(@Param("searchValue") String searchValue,@Param("page") Integer page,@Param("rows") Integer rows)
    {
        List<DeviceType> deviceTypes = deviceTypeService.searchDeviceTypeByDeviceTypeId(searchValue, page, rows);
        return deviceTypes;
    }

    /**
     * 根据设备名称进行搜索(未实现分页功能)（未实现模糊查找功能）
     * @param searchValue
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("deviceType/search_deviceType_by_deviceTypeName")
    @ResponseBody
    public List<DeviceType> searchDeviceTypeByDeviceTypeName(@Param("searchValue") String searchValue,@Param("page") Integer page,@Param("rows") Integer rows)
    {
        List<DeviceType> deviceTypes = deviceTypeService.searchDeviceTypeByDeviceTypeName(searchValue, page, rows);
        return deviceTypes;
    }
}
