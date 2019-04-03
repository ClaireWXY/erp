package com.cskaoyan.bean;

public class TechnologyPlan {
    String	technologyPlanId;
    String	technologyId;
    int		batchAmount;
    String	startPlan;
    String	endPlan;
    String	commitPlan;
    String	technologyPlanStart;
    String	technologyPlanEnd;

    public TechnologyPlan() {
    }

    public TechnologyPlan(String technologyPlanId, String technologyId, int batchAmount, String startPlan, String endPlan, String commitPlan, String technologyPlanStart, String technologyPlanEnd) {
        this.technologyPlanId = technologyPlanId;
        this.technologyId = technologyId;
        this.batchAmount = batchAmount;
        this.startPlan = startPlan;
        this.endPlan = endPlan;
        this.commitPlan = commitPlan;
        this.technologyPlanStart = technologyPlanStart;
        this.technologyPlanEnd = technologyPlanEnd;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId;
    }

    public int getBatchAmount() {
        return batchAmount;
    }

    public void setBatchAmount(int batchAmount) {
        this.batchAmount = batchAmount;
    }

    public String getStartPlan() {
        return startPlan;
    }

    public void setStartPlan(String startPlan) {
        this.startPlan = startPlan;
    }

    public String getEndPlan() {
        return endPlan;
    }

    public void setEndPlan(String endPlan) {
        this.endPlan = endPlan;
    }

    public String getCommitPlan() {
        return commitPlan;
    }

    public void setCommitPlan(String commitPlan) {
        this.commitPlan = commitPlan;
    }

    public String getTechnologyPlanStart() {
        return technologyPlanStart;
    }

    public void setTechnologyPlanStart(String technologyPlanStart) {
        this.technologyPlanStart = technologyPlanStart;
    }

    public String getTechnologyPlanEnd() {
        return technologyPlanEnd;
    }

    public void setTechnologyPlanEnd(String technologyPlanEnd) {
        this.technologyPlanEnd = technologyPlanEnd;
    }

    @Override
    public String toString() {
        return "bean.TechnologyPlan{" +
                "technologyPlanId='" + technologyPlanId + '\'' +
                ", technologyId='" + technologyId + '\'' +
                ", batchAmount=" + batchAmount +
                ", startPlan='" + startPlan + '\'' +
                ", endPlan='" + endPlan + '\'' +
                ", commitPlan='" + commitPlan + '\'' +
                ", technologyPlanStart='" + technologyPlanStart + '\'' +
                ", technologyPlanEnd='" + technologyPlanEnd + '\'' +
                '}';
    }
}
