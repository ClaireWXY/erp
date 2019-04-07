package com.cskaoyan.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CustomOrder {
    String 	orderId;
    String 	customId;
    String 	productId;
    Date orderDate;
    Date 	requestDate;
    String 	note;
    int    	quantity;
    BigDecimal	unitPrice;
    String	unit;
    String	image;
    String	file;
    int		status;
    Custom custom;
    Product product;

    public CustomOrder() {
    }

    public CustomOrder(String orderId, String customId, String productId, Date orderDate, Date requestDate, String note, int quantity, BigDecimal unitPrice, String unit, String image, String file, int status, Custom custom, Product product) {
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
        this.custom = custom;
        this.product = product;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
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

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CustomOrder{" +
                "orderId='" + orderId + '\'' +
                ", customId='" + customId + '\'' +
                ", productId='" + productId + '\'' +
                ", orderDate=" + orderDate +
                ", requestDate=" + requestDate +
                ", note='" + note + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", unit='" + unit + '\'' +
                ", image='" + image + '\'' +
                ", file='" + file + '\'' +
                ", status=" + status +
                ", custom=" + custom +
                ", product=" + product +
                '}';
    }
}
