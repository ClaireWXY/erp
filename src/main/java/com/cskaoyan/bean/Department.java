package com.cskaoyan.bean;

public class Department {
    String 	departmentId;
    String	departmentName;
    String	note;

    public Department() {
    }

    public Department(String departmentId, String departmentName, String note) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.note = note;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "bean.Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

