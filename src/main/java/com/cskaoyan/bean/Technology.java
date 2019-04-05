package com.cskaoyan.bean;

import java.util.List;

public class Technology {
    String	technologyId;
    String	technologyName;
    double	price;
    String	vitalProcessPeriod;
    int		standardCapacity;
    int		overtimeStandardCapacity;
    int		overtimeOverfulfilCapacity;
    int		doubleCapacity;
    int		overfulfilCapacity;


    public Technology() {
    }

    public Technology(String technologyId, String technologyName, double price, String vitalProcessPeriod, int standardCapacity, int overtimeStandardCapacity, int overtimeOverfulfilCapacity, int doubleCapacity, int overfulfilCapacity, List<TechnologyRequirement> technologyRequirements) {
        this.technologyId = technologyId;
        this.technologyName = technologyName;
        this.price = price;
        this.vitalProcessPeriod = vitalProcessPeriod;
        this.standardCapacity = standardCapacity;
        this.overtimeStandardCapacity = overtimeStandardCapacity;
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
        this.doubleCapacity = doubleCapacity;
        this.overfulfilCapacity = overfulfilCapacity;
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVitalProcessPeriod() {
        return vitalProcessPeriod;
    }

    public void setVitalProcessPeriod(String vitalProcessPeriod) {
        this.vitalProcessPeriod = vitalProcessPeriod;
    }

    public int getStandardCapacity() {
        return standardCapacity;
    }

    public void setStandardCapacity(int standardCapacity) {
        this.standardCapacity = standardCapacity;
    }

    public int getOvertimeStandardCapacity() {
        return overtimeStandardCapacity;
    }

    public void setOvertimeStandardCapacity(int overtimeStandardCapacity) {
        this.overtimeStandardCapacity = overtimeStandardCapacity;
    }

    public int getOvertimeOverfulfilCapacity() {
        return overtimeOverfulfilCapacity;
    }

    public void setOvertimeOverfulfilCapacity(int overtimeOverfulfilCapacity) {
        this.overtimeOverfulfilCapacity = overtimeOverfulfilCapacity;
    }

    public int getDoubleCapacity() {
        return doubleCapacity;
    }

    public void setDoubleCapacity(int doubleCapacity) {
        this.doubleCapacity = doubleCapacity;
    }

    public int getOverfulfilCapacity() {
        return overfulfilCapacity;
    }

    public void setOverfulfilCapacity(int overfulfilCapacity) {
        this.overfulfilCapacity = overfulfilCapacity;
    }


    @Override
    public String toString() {
        return "Technology{" +
                "technologyId='" + technologyId + '\'' +
                ", technologyName='" + technologyName + '\'' +
                ", price=" + price +
                ", vitalProcessPeriod='" + vitalProcessPeriod + '\'' +
                ", standardCapacity=" + standardCapacity +
                ", overtimeStandardCapacity=" + overtimeStandardCapacity +
                ", overtimeOverfulfilCapacity=" + overtimeOverfulfilCapacity +
                ", doubleCapacity=" + doubleCapacity +
                ", overfulfilCapacity=" + overfulfilCapacity +
                '}';
    }
}
