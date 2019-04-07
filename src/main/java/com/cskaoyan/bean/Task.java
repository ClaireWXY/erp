package com.cskaoyan.bean;

import java.math.BigDecimal;

public class Task {
    String	taskId;
    String	manufactureSn;
    String	workId;
    int		taskQuantity;
    BigDecimal workingHours;

    public Task() {
    }

    public Task(String taskId, String manufactureSn, String workId, int taskQuantity, BigDecimal workingHours) {
        this.taskId = taskId;
        this.manufactureSn = manufactureSn;
        this.workId = workId;
        this.taskQuantity = taskQuantity;
        this.workingHours = workingHours;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getManufactureSn() {
        return manufactureSn;
    }

    public void setManufactureSn(String manufactureSn) {
        this.manufactureSn = manufactureSn;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public int getTaskQuantity() {
        return taskQuantity;
    }

    public void setTaskQuantity(int taskQuantity) {
        this.taskQuantity = taskQuantity;
    }

    public BigDecimal getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(BigDecimal workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "bean.Task{" +
                "taskId='" + taskId + '\'' +
                ", manufactureSn='" + manufactureSn + '\'' +
                ", workId='" + workId + '\'' +
                ", taskQuantity=" + taskQuantity +
                ", workingHours=" + workingHours +
                '}';
    }
}
