package com.cskaoyan.controller.device;

import com.cskaoyan.bean.DeviceCheck;
import com.cskaoyan.service.DeviceCheckService;
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
public class DeviceCheckController
{
    @Autowired
    private DeviceCheckService deviceCheckService;

    /**
     * 查询所有设备例检
     * @return
     */
    @RequestMapping(value="device/deviceCheck")
    public String deviceCheckForm(@Param("page") Integer page, @Param("rows") Integer rows){
        // 动态跳转页面
        return "deviceCheck";
    }

    @RequestMapping(value="deviceCheck/list")
    @ResponseBody
    public List<DeviceCheck> deviceCheckList(@Param("page") Integer page, @Param("rows") Integer rows)
    {
        List<DeviceCheck> deviceChecks = this.deviceCheckService.queryAllDeviceCheck(1, 30);
        return deviceChecks;
    }
}
