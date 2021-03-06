package com.cskaoyan.bean;

import java.util.Date;

public class Manufacture {
    String	manufactureSn;
    String	orderId;
    String	technologyId;
    int		launchQuantity;
    Date beginDate;
    Date endDate;
    CustomOrder customOrder;
    Technology technology;

    public Manufacture() {
    }

    public Manufacture(String manufactureSn, String orderId, String technologyId, int launchQuantity, Date beginDate, Date endDate, CustomOrder customOrder, Technology technology) {
        this.manufactureSn = manufactureSn;
        this.orderId = orderId;
        this.technologyId = technologyId;
        this.launchQuantity = launchQuantity;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.customOrder = customOrder;
        this.technology = technology;
    }

    public Manufacture(String manufactureSn, String orderId, String technologyId, int launchQuantity, Date beginDate, Date endDate) {
        this.manufactureSn = manufactureSn;
        this.orderId = orderId;
        this.technologyId = technologyId;
        this.launchQuantity = launchQuantity;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public CustomOrder getCustomOrder() {
        return customOrder;
    }

    public void setCustomOrder(CustomOrder customOrder) {
        this.customOrder = customOrder;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public int getLaunchQuantity() {
        return launchQuantity;
    }

    public void setLaunchQuantity(int launchQuantity) {
        this.launchQuantity = launchQuantity;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "manufactureSn='" + manufactureSn + '\'' +
                ", orderId='" + orderId + '\'' +
                ", technologyId='" + technologyId + '\'' +
                ", launchQuantity=" + launchQuantity +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", customOrder=" + customOrder +
                ", technology=" + technology +
                '}';
    }
}
