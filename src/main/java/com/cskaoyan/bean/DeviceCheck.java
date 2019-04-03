package com.cskaoyan.bean;

public class DeviceCheck {
    String	deviceCheckId;
    String	deviceId;
    String	deviceCheckEmpId	;
    String	deviceCheckDate;
    String	deviceCheckResult;
    String	deviceCheckFaultId;

    public DeviceCheck() {
    }

    public DeviceCheck(String deviceCheckId, String deviceId, String deviceCheckEmpId, String deviceCheckDate, String deviceCheckResult, String deviceCheckFaultId) {
        this.deviceCheckId = deviceCheckId;
        this.deviceId = deviceId;
        this.deviceCheckEmpId = deviceCheckEmpId;
        this.deviceCheckDate = deviceCheckDate;
        this.deviceCheckResult = deviceCheckResult;
        this.deviceCheckFaultId = deviceCheckFaultId;
    }

    public String getDeviceCheckId() {
        return deviceCheckId;
    }

    public void setDeviceCheckId(String deviceCheckId) {
        this.deviceCheckId = deviceCheckId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceCheckEmpId() {
        return deviceCheckEmpId;
    }

    public void setDeviceCheckEmpId(String deviceCheckEmpId) {
        this.deviceCheckEmpId = deviceCheckEmpId;
    }

    public String getDeviceCheckDate() {
        return deviceCheckDate;
    }

    public void setDeviceCheckDate(String deviceCheckDate) {
        this.deviceCheckDate = deviceCheckDate;
    }

    public String getDeviceCheckResult() {
        return deviceCheckResult;
    }

    public void setDeviceCheckResult(String deviceCheckResult) {
        this.deviceCheckResult = deviceCheckResult;
    }

    public String getDeviceCheckFaultId() {
        return deviceCheckFaultId;
    }

    public void setDeviceCheckFaultId(String deviceCheckFaultId) {
        this.deviceCheckFaultId = deviceCheckFaultId;
    }

    @Override
    public String toString() {
        return "bean.DeviceCheck{" +
                "deviceCheckId='" + deviceCheckId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceCheckEmpId='" + deviceCheckEmpId + '\'' +
                ", deviceCheckDate='" + deviceCheckDate + '\'' +
                ", deviceCheckResult='" + deviceCheckResult + '\'' +
                ", deviceCheckFaultId='" + deviceCheckFaultId + '\'' +
                '}';
    }
}

