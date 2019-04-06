package com.cskaoyan.bean;

public class PagePCountCheckList {

    String pCountCheckId;
    String processId;
    String checkItem;
    String sample;
    String checkNumber;
    String unqualify;
    String qualify;
    String cdate;
    String measureData;
    String empId;
    String result;
    String note;
    String empName;

    public PagePCountCheckList() {
    }

    public PagePCountCheckList(String pCountCheckId, String processId, String checkItem, String sample, String checkNumber, String unqualify, String qualify, String cdate, String measureData, String empId, String result, String note, String empName) {
        this.pCountCheckId = pCountCheckId;
        this.processId = processId;
        this.checkItem = checkItem;
        this.sample = sample;
        this.checkNumber = checkNumber;
        this.unqualify = unqualify;
        this.qualify = qualify;
        this.cdate = cdate;
        this.measureData = measureData;
        this.empId = empId;
        this.result = result;
        this.note = note;
        this.empName = empName;
    }

    public String getpCountCheckId() {
        return pCountCheckId;
    }

    public void setpCountCheckId(String pCountCheckId) {
        this.pCountCheckId = pCountCheckId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getUnqualify() {
        return unqualify;
    }

    public void setUnqualify(String unqualify) {
        this.unqualify = unqualify;
    }

    public String getQualify() {
        return qualify;
    }

    public void setQualify(String qualify) {
        this.qualify = qualify;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getMeasureData() {
        return measureData;
    }

    public void setMeasureData(String measureData) {
        this.measureData = measureData;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "PagePCountCheckList{" +
                "pCountCheckId='" + pCountCheckId + '\'' +
                ", processId='" + processId + '\'' +
                ", checkItem='" + checkItem + '\'' +
                ", sample='" + sample + '\'' +
                ", checkNumber='" + checkNumber + '\'' +
                ", unqualify='" + unqualify + '\'' +
                ", qualify='" + qualify + '\'' +
                ", cdate='" + cdate + '\'' +
                ", measureData='" + measureData + '\'' +
                ", empId='" + empId + '\'' +
                ", result='" + result + '\'' +
                ", note='" + note + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
