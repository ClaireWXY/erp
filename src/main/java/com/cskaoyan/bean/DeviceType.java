package com.cskaoyan.bean;

public class DeviceType {
    String	deviceTypeId;
    String	deviceTypeName;
    String	deviceTypeModel;
    String	deviceTypeSpec;
    String	deviceTypeSupplier;
    String	deviceTypeProducer;
    int		deviceTypeQuantity;
    String	deviceTypeWarranty;

    public DeviceType() {
    }

    public DeviceType(String deviceTypeId, String deviceTypeName, String deviceTypeModel, String deviceTypeSpec, String deviceTypeSupplier, String deviceTypeProducer, int deviceTypeQuantity, String deviceTypeWarranty) {
        this.deviceTypeId = deviceTypeId;
        this.deviceTypeName = deviceTypeName;
        this.deviceTypeModel = deviceTypeModel;
        this.deviceTypeSpec = deviceTypeSpec;
        this.deviceTypeSupplier = deviceTypeSupplier;
        this.deviceTypeProducer = deviceTypeProducer;
        this.deviceTypeQuantity = deviceTypeQuantity;
        this.deviceTypeWarranty = deviceTypeWarranty;
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceTypeModel() {
        return deviceTypeModel;
    }

    public void setDeviceTypeModel(String deviceTypeModel) {
        this.deviceTypeModel = deviceTypeModel;
    }

    public String getDeviceTypeSpec() {
        return deviceTypeSpec;
    }

    public void setDeviceTypeSpec(String deviceTypeSpec) {
        this.deviceTypeSpec = deviceTypeSpec;
    }

    public String getDeviceTypeSupplier() {
        return deviceTypeSupplier;
    }

    public void setDeviceTypeSupplier(String deviceTypeSupplier) {
        this.deviceTypeSupplier = deviceTypeSupplier;
    }

    public String getDeviceTypeProducer() {
        return deviceTypeProducer;
    }

    public void setDeviceTypeProducer(String deviceTypeProducer) {
        this.deviceTypeProducer = deviceTypeProducer;
    }

    public int getDeviceTypeQuantity() {
        return deviceTypeQuantity;
    }

    public void setDeviceTypeQuantity(int deviceTypeQuantity) {
        this.deviceTypeQuantity = deviceTypeQuantity;
    }

    public String getDeviceTypeWarranty() {
        return deviceTypeWarranty;
    }

    public void setDeviceTypeWarranty(String deviceTypeWarranty) {
        this.deviceTypeWarranty = deviceTypeWarranty;
    }

    @Override
    public String toString() {
        return "bean.DeviceType{" +
                "deviceTypeId='" + deviceTypeId + '\'' +
                ", deviceTypeName='" + deviceTypeName + '\'' +
                ", deviceTypeModel='" + deviceTypeModel + '\'' +
                ", deviceTypeSpec='" + deviceTypeSpec + '\'' +
                ", deviceTypeSupplier='" + deviceTypeSupplier + '\'' +
                ", deviceTypeProducer='" + deviceTypeProducer + '\'' +
                ", deviceTypeQuantity=" + deviceTypeQuantity +
                ", deviceTypeWarranty='" + deviceTypeWarranty + '\'' +
                '}';
    }
}
