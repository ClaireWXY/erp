package com.cskaoyan.controller.device;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.bean.TotalAndList;
import com.cskaoyan.service.DeviceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: OCW
 * @Date: 19/04/04 09:37
 */
@org.springframework.stereotype.Controller
public class DeviceListController
{
    @Autowired
    private DeviceListService deviceService;

    @RequestMapping(value = "device/deviceList")
    public String DeviceCheckForm()
    {
        // 动态跳转页面
        return "deviceList";
    }


    //分页查询设备
    @RequestMapping("deviceList/list")
    @ResponseBody
    public TotalAndList queryAllDeviceList(Integer page, Integer rows)
    {
        TotalAndList totalAndList = deviceService.queryAllDeviceList(page, rows);
        return totalAndList;
    }




    //添加一个设备
    @RequestMapping("deviceList/add")
    public String add()
    {
        return "deviceList_add";
    }


   @RequestMapping("deviceList/insert")
    @ResponseBody
    public Tip addDevice(Device device)
    {
        boolean addBoolean = deviceService.addDevice(device);
        if (addBoolean)
        {
            return new Tip("200", "新增台账成功!", null);
        }
        return new Tip("0", "添加失败。", null);
    }

    //编辑台账
    @RequestMapping("deviceList/edit")
    public String update()
    {
        return "deviceList_edit";
    }


    @RequestMapping("deviceList/update")
    @ResponseBody
    public Tip updateDevice(Device device)
    {
        boolean addBoolean = deviceService.updateDevice(device);
        if (addBoolean)
        {
            return new Tip("200", "编辑台账成功!", null);
        }
        return new Tip("0", "编辑失败。", null);
    }


    //删除台账
    @RequestMapping("deviceList/delete_batch")
    @ResponseBody
    public Tip deleteDevice(String[] ids)
    {
        boolean addBoolean = deviceService.deleteDevice(ids);
        if (addBoolean)
        {
            return new Tip("200", "编辑台账成功!", null);
        }
        return new Tip("0", "编辑失败。", null);
    }
}
