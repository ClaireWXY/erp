package com.cskaoyan.bean;

public class CustomOrder {
    String 	orderId;
    String 	customId;
    String 	productId;
    String 	orderDate;
    String 	requestDate;
    String 	note;
    int    	quantity;
    double	unitPrice;
    String	unit;
    String	image;
    String	file;
    int		status;

    public CustomOrder() {
    }

    public CustomOrder(String orderId, String customId, String productId, String orderDate, String requestDate, String note, int quantity, double unitPrice, String unit, String image, String file, int status) {
        this.orderId = orderId;
        this.customId = customId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.requestDate = requestDate;
        this.note = note;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.unit = unit;
        this.image = image;
        this.file = file;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "bean.CustomOrder{" +
                "orderId='" + orderId + '\'' +
                ", customId='" + customId + '\'' +
                ", productId='" + productId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", note='" + note + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", unit='" + unit + '\'' +
                ", image='" + image + '\'' +
                ", file='" + file + '\'' +
                ", status=" + status +
                '}';
    }
}
