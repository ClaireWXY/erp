package com.cskaoyan.bean;

public class Process {
    String	processId;
    String	technologyPlanId;
    int		sequence;
    int		quota;

    public Process() {
    }

    public Process(String processId, String technologyPlanId, int sequence, int quota) {
        this.processId = processId;
        this.technologyPlanId = technologyPlanId;
        this.sequence = sequence;
        this.quota = quota;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "bean.Process{" +
                "processId='" + processId + '\'' +
                ", technologyPlanId='" + technologyPlanId + '\'' +
                ", sequence=" + sequence +
                ", quota=" + quota +
                '}';
    }
}
