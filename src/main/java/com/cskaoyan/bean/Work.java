package com.cskaoyan.bean;

public class Work {
    String	workId;
    String	processNumber;
    String	productId;
    String	processId;
    String	deviceId;
    int		rating;
    Product product;
    Process process;
    Device device;

    public Work() {
    }

    public Work(String workId, String processNumber, String productId, String processId, String deviceId, int rating, Product product, Process process, Device device) {
        this.workId = workId;
        this.processNumber = processNumber;
        this.productId = productId;
        this.processId = processId;
        this.deviceId = deviceId;
        this.rating = rating;
        this.product = product;
        this.process = process;
        this.device = device;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workId='" + workId + '\'' +
                ", processNumber='" + processNumber + '\'' +
                ", productId='" + productId + '\'' +
                ", processId='" + processId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", rating=" + rating +
                ", product=" + product +
                ", process=" + process +
                ", device=" + device +
                '}';
    }
}
