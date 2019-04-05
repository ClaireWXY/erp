package com.cskaoyan.controller.device;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: OCW
 * @Date: 19/04/04 09:37
 */
@org.springframework.stereotype.Controller
public class DeviceListController
{

    @RequestMapping(value = "device/deviceList")
    public String DeviceCheckForm()
    {
        // 动态跳转页面
        return "deviceList";
    }
}
