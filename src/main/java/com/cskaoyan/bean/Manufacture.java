package com.cskaoyan.bean;

public class Manufacture {
    String	manufactureSn;
    String	orderId;
    String	technologyId;
    int		launchQuantity;
    String	beginDate;
    String	endDate;

    public Manufacture() {
    }

    public Manufacture(String manufactureSn, String orderId, String technologyId, int launchQuantity, String beginDate, String endDate) {
        this.manufactureSn = manufactureSn;
        this.orderId = orderId;
        this.technologyId = technologyId;
        this.launchQuantity = launchQuantity;
        this.beginDate = beginDate;
        this.endDate = endDate;
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "bean.Manufacture{" +
                "manufactureSn='" + manufactureSn + '\'' +
                ", orderId='" + orderId + '\'' +
                ", technologyId='" + technologyId + '\'' +
                ", launchQuantity=" + launchQuantity +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
