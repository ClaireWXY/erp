package com.cskaoyan.bean;

public class Device {
    String	deviceId;
    String	deviceName;
    String	deviceTypeId;
    String	deviceStatusId;
    String	deviceStatus;
    String	devicePurchaseDate;
    double	devicePurchasePrice;
    String	deviceManufactureDate;
    String	deviceServiceLife;
    String	deviceKeeperId;
    String  deviceTypeName;
    String  deviceKeeper;
    String	note;

    public Device()
    {
    }

    public Device(String deviceId, String deviceName, String deviceTypeId, String deviceStatusId, String deviceStatus, String devicePurchaseDate, double devicePurchasePrice, String deviceManufactureDate, String deviceServiceLife, String deviceKeeperId, String deviceTypeName, String deviceKeeper, String note)
    {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.deviceTypeId = deviceTypeId;
        this.deviceStatusId = deviceStatusId;
        this.deviceStatus = deviceStatus;
        this.devicePurchaseDate = devicePurchaseDate;
        this.devicePurchasePrice = devicePurchasePrice;
        this.deviceManufactureDate = deviceManufactureDate;
        this.deviceServiceLife = deviceServiceLife;
        this.deviceKeeperId = deviceKeeperId;
        this.deviceTypeName = deviceTypeName;
        this.deviceKeeper = deviceKeeper;
        this.note = note;
    }

    public String getDeviceId()
    {
        return deviceId;
    }

    public void setDeviceId(String deviceId)
    {
        this.deviceId = deviceId;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public String getDeviceTypeId()
    {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId)
    {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceStatusId()
    {
        return deviceStatusId;
    }

    public void setDeviceStatusId(String deviceStatusId)
    {
        this.deviceStatusId = deviceStatusId;
    }

    public String getDeviceStatus()
    {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus)
    {
        this.deviceStatus = deviceStatus;
    }

    public String getDevicePurchaseDate()
    {
        return devicePurchaseDate;
    }

    public void setDevicePurchaseDate(String devicePurchaseDate)
    {
        this.devicePurchaseDate = devicePurchaseDate;
    }

    public double getDevicePurchasePrice()
    {
        return devicePurchasePrice;
    }

    public void setDevicePurchasePrice(double devicePurchasePrice)
    {
        this.devicePurchasePrice = devicePurchasePrice;
    }

    public String getDeviceManufactureDate()
    {
        return deviceManufactureDate;
    }

    public void setDeviceManufactureDate(String deviceManufactureDate)
    {
        this.deviceManufactureDate = deviceManufactureDate;
    }

    public String getDeviceServiceLife()
    {
        return deviceServiceLife;
    }

    public void setDeviceServiceLife(String deviceServiceLife)
    {
        this.deviceServiceLife = deviceServiceLife;
    }

    public String getDeviceKeeperId()
    {
        return deviceKeeperId;
    }

    public void setDeviceKeeperId(String deviceKeeperId)
    {
        this.deviceKeeperId = deviceKeeperId;
    }

    public String getDeviceTypeName()
    {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName)
    {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceKeeper()
    {
        return deviceKeeper;
    }

    public void setDeviceKeeper(String deviceKeeper)
    {
        this.deviceKeeper = deviceKeeper;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }
}
