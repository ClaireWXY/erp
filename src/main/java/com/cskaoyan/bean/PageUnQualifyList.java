package com.cskaoyan.bean;

public class PageUnQualifyList {
    String	unqualifyApplyId;
    String	productId;
    String	unqualifyItem;
    int		unqualifyCount;
    String	assemblyDate;
    String	empId;
    String	applyDate;
    String	note;
    String	productName;
    String	empName;

    public PageUnQualifyList() {
    }

    public PageUnQualifyList(String unqualifyApplyId, String productId, String unqualifyItem, int unqualifyCount, String assemblyDate, String empId, String applyDate, String note, String productName, String empName) {
        this.unqualifyApplyId = unqualifyApplyId;
        this.productId = productId;
        this.unqualifyItem = unqualifyItem;
        this.unqualifyCount = unqualifyCount;
        this.assemblyDate = assemblyDate;
        this.empId = empId;
        this.applyDate = applyDate;
        this.note = note;
        this.productName = productName;
        this.empName = empName;
    }

    public String getUnqualifyApplyId() {
        return unqualifyApplyId;
    }

    public void setUnqualifyApplyId(String unqualifyApplyId) {
        this.unqualifyApplyId = unqualifyApplyId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUnqualifyItem() {
        return unqualifyItem;
    }

    public void setUnqualifyItem(String unqualifyItem) {
        this.unqualifyItem = unqualifyItem;
    }

    public int getUnqualifyCount() {
        return unqualifyCount;
    }

    public void setUnqualifyCount(int unqualifyCount) {
        this.unqualifyCount = unqualifyCount;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "UnqualifyApplyList{" +
                "unqualifyApplyId='" + unqualifyApplyId + '\'' +
                ", productId='" + productId + '\'' +
                ", unqualifyItem='" + unqualifyItem + '\'' +
                ", unqualifyCount=" + unqualifyCount +
                ", assemblyDate='" + assemblyDate + '\'' +
                ", empId='" + empId + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", note='" + note + '\'' +
                ", productName='" + productName + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
