package com.cskaoyan.bean;

public class DeviceMaintain {
    String	deviceMaintainId;
    String	deviceFaultId;
    String	deviceMaintainEmpId;
    String	deviceMaintainDate;
    String	deviceMaintainResult;
    String	deviceMaintainCost;
    String 	note;

    public DeviceMaintain() {
    }

    public DeviceMaintain(String deviceMaintainId, String deviceFaultId, String deviceMaintainEmpId, String deviceMaintainDate, String deviceMaintainResult, String deviceMaintainCost, String note) {
        this.deviceMaintainId = deviceMaintainId;
        this.deviceFaultId = deviceFaultId;
        this.deviceMaintainEmpId = deviceMaintainEmpId;
        this.deviceMaintainDate = deviceMaintainDate;
        this.deviceMaintainResult = deviceMaintainResult;
        this.deviceMaintainCost = deviceMaintainCost;
        this.note = note;
    }

    public String getDeviceMaintainId() {
        return deviceMaintainId;
    }

    public void setDeviceMaintainId(String deviceMaintainId) {
        this.deviceMaintainId = deviceMaintainId;
    }

    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId;
    }

    public String getDeviceMaintainEmpId() {
        return deviceMaintainEmpId;
    }

    public void setDeviceMaintainEmpId(String deviceMaintainEmpId) {
        this.deviceMaintainEmpId = deviceMaintainEmpId;
    }

    public String getDeviceMaintainDate() {
        return deviceMaintainDate;
    }

    public void setDeviceMaintainDate(String deviceMaintainDate) {
        this.deviceMaintainDate = deviceMaintainDate;
    }

    public String getDeviceMaintainResult() {
        return deviceMaintainResult;
    }

    public void setDeviceMaintainResult(String deviceMaintainResult) {
        this.deviceMaintainResult = deviceMaintainResult;
    }

    public String getDeviceMaintainCost() {
        return deviceMaintainCost;
    }

    public void setDeviceMaintainCost(String deviceMaintainCost) {
        this.deviceMaintainCost = deviceMaintainCost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "bean.DeviceMaintain{" +
                "deviceMaintainId='" + deviceMaintainId + '\'' +
                ", deviceFaultId='" + deviceFaultId + '\'' +
                ", deviceMaintainEmpId='" + deviceMaintainEmpId + '\'' +
                ", deviceMaintainDate='" + deviceMaintainDate + '\'' +
                ", deviceMaintainResult='" + deviceMaintainResult + '\'' +
                ", deviceMaintainCost='" + deviceMaintainCost + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
