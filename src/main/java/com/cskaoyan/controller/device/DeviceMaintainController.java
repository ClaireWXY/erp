package com.cskaoyan.controller.device;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: OCW
 * @Date: 19/04/04 09:37
 */
@Controller
public class DeviceMaintainController
{
    //获取任意uri
//    @RequestMapping(value="device/{deviceMaintain}")
//    public String DeviceCheckForm(@PathVariable("deviceMaintain") String deviceMaintain){
    @RequestMapping(value="device/deviceMaintain")
    public String DeviceCheckForm(){

        // 动态跳转页面
        return "deviceMaintain";
    }
}
