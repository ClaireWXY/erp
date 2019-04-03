package com.cskaoyan.bean;

public class Work {
    String	workId;
    String	processNumber;
    String	productId;
    String	processId;
    String	deviceId;
    int		rating;

    public Work() {
    }

    public Work(String workId, String processNumber, String productId, String processId, String deviceId, int rating) {
        this.workId = workId;
        this.processNumber = processNumber;
        this.productId = productId;
        this.processId = processId;
        this.deviceId = deviceId;
        this.rating = rating;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getProcessNumber() {
        return processNumber;
    }

    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "bean.Work{" +
                "workId='" + workId + '\'' +
                ", processNumber='" + processNumber + '\'' +
                ", productId='" + productId + '\'' +
                ", processId='" + processId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", rating=" + rating +
                '}';
    }
}
