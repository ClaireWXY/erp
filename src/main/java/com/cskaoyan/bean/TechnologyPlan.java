package com.cskaoyan.bean;

import java.util.Date;

public class TechnologyPlan {
    private String technologyPlanId;

    private String technologyId;

    private Integer batchAmount;

    private Date startPlan;

    private Date endPlan;

    private Date commitPlan;

    private Date technologyPlanStart;

    private Date technologyPlanEnd;

    private String technologyName;//technology表中的technologyName

    public TechnologyPlan() {
    }

    public TechnologyPlan(String technologyPlanId, String technologyId, Integer batchAmount, Date startPlan, Date endPlan, Date commitPlan, Date technologyPlanStart, Date technologyPlanEnd, String technologyName) {
        this.technologyPlanId = technologyPlanId;
        this.technologyId = technologyId;
        this.batchAmount = batchAmount;
        this.startPlan = startPlan;
        this.endPlan = endPlan;
        this.commitPlan = commitPlan;
        this.technologyPlanStart = technologyPlanStart;
        this.technologyPlanEnd = technologyPlanEnd;
        this.technologyName = technologyName;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId == null ? null : technologyPlanId.trim();
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId == null ? null : technologyId.trim();
    }

    public Integer getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(Integer batchAmount) {
        this.batchAmount = batchAmount;
    }

    public Date getStartPlan() {
        return startPlan;
    }

    public void setStartPlan(Date startPlan) {
        this.startPlan = startPlan;
    }

    public Date getEndPlan() {
        return endPlan;
    }

    public void setEndPlan(Date endPlan) {
        this.endPlan = endPlan;
    }

    public Date getCommitPlan() {
        return commitPlan;
    }

    public void setCommitPlan(Date commitPlan) {
        this.commitPlan = commitPlan;
    }

    public Date getTechnologyPlanStart() {
        return technologyPlanStart;
    }

    public void setTechnologyPlanStart(Date technologyPlanStart) {
        this.technologyPlanStart = technologyPlanStart;
    }

    public Date getTechnologyPlanEnd() {
        return technologyPlanEnd;
    }

    public void setTechnologyPlanEnd(Date technologyPlanEnd) {
        this.technologyPlanEnd = technologyPlanEnd;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    @Override
    public String toString() {
        return "TechnologyPlan{" +
                "technologyPlanId='" + technologyPlanId + '\'' +
                ", technologyId='" + technologyId + '\'' +
                ", batchAmount=" + batchAmount +
                ", startPlan=" + startPlan +
                ", endPlan=" + endPlan +
                ", commitPlan=" + commitPlan +
                ", technologyPlanStart=" + technologyPlanStart +
                ", technologyPlanEnd=" + technologyPlanEnd +
                ", technologyName='" + technologyName + '\'' +
                '}';
    }
}
