package com.cskaoyan.controller.device;

import com.cskaoyan.bean.DeviceType;
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

    @RequestMapping("device/deviceType")
       public String DeviceCheckForm(@Param("page") Integer page, @Param("rows") Integer rows)
    {
        return "deviceType";
    }
    /**
     * 查询所有的数据
     */
    @RequestMapping("deviceType/list")
    @ResponseBody
    public List<DeviceType> list(@Param("page") Integer page, @Param("rows") Integer rows) {
        List<DeviceType> deviceTypes = deviceTypeService.queryDeviceTypeList(1, 30);
        return deviceTypes;
    }
}
