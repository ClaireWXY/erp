package com.cskaoyan.bean;

public class DeviceFault {
    String	deviceFaultId;
    String	deviceId;
    String	deviceFaultCause;
    String	deviceFaultDetail;
    String	deviceFaultDate;
    String	deviceFaultMaintenance;

    public DeviceFault() {
    }

    public DeviceFault(String deviceFaultId, String deviceId, String deviceFaultCause, String deviceFaultDetail, String deviceFaultDate, String deviceFaultMaintenance) {
        this.deviceFaultId = deviceFaultId;
        this.deviceId = deviceId;
        this.deviceFaultCause = deviceFaultCause;
        this.deviceFaultDetail = deviceFaultDetail;
        this.deviceFaultDate = deviceFaultDate;
        this.deviceFaultMaintenance = deviceFaultMaintenance;
    }

    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceFaultCause() {
        return deviceFaultCause;
    }

    public void setDeviceFaultCause(String deviceFaultCause) {
        this.deviceFaultCause = deviceFaultCause;
    }

    public String getDeviceFaultDetail() {
        return deviceFaultDetail;
    }

    public void setDeviceFaultDetail(String deviceFaultDetail) {
        this.deviceFaultDetail = deviceFaultDetail;
    }

    public String getDeviceFaultDate() {
        return deviceFaultDate;
    }

    public void setDeviceFaultDate(String deviceFaultDate) {
        this.deviceFaultDate = deviceFaultDate;
    }

    public String getDeviceFaultMaintenance() {
        return deviceFaultMaintenance;
    }

    public void setDeviceFaultMaintenance(String deviceFaultMaintenance) {
        this.deviceFaultMaintenance = deviceFaultMaintenance;
    }

    @Override
    public String toString() {
        return "bean.DeviceFault{" +
                "deviceFaultId='" + deviceFaultId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceFaultCause='" + deviceFaultCause + '\'' +
                ", deviceFaultDetail='" + deviceFaultDetail + '\'' +
                ", deviceFaultDate='" + deviceFaultDate + '\'' +
                ", deviceFaultMaintenance='" + deviceFaultMaintenance + '\'' +
                '}';
    }
}

