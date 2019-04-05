package com.cskaoyan.controller.device;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: OCW
 * @Date: 19/04/04 09:37
 */
@Controller
public class DeviceFaultController
{
    //获取任意uri
//    @RequestMapping(value="device/{deviceFault}")
//    public String DeviceCheckForm(@PathVariable("deviceFault") String deviceFault){
     @RequestMapping(value="device/deviceFault")
    public String DeviceCheckForm(){

        // 动态跳转页面
        return "deviceFault";
    }
}
