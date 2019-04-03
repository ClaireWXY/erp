package com.cskaoyan.bean;

public class Product {
    String	productId;
    String	productName;
    String	productType;
    String	image;
    String	note;
    int		status;

    public Product() {
    }

    public Product(String productId, String productName, String productType, String image, String note, int status) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.image = image;
        this.note = note;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "bean.Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", image='" + image + '\'' +
                ", note='" + note + '\'' +
                ", status=" + status +
                '}';
    }
}
