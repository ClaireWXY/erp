package com.cskaoyan.bean;

public class MaterialConsume {
    String	consumeId;
    String	workId;
    String	materialId;
    int		consumeAmount;
    String	consumeDate;
    String	sender;
    String	receiver;
    String	note;

    public MaterialConsume() {
    }

    public MaterialConsume(String consumeId, String workId, String materialId, int consumeAmount, String consumeDate, String sender, String receiver, String note) {
        this.consumeId = consumeId;
        this.workId = workId;
        this.materialId = materialId;
        this.consumeAmount = consumeAmount;
        this.consumeDate = consumeDate;
        this.sender = sender;
        this.receiver = receiver;
        this.note = note;
    }

    public String getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(String consumeId) {
        this.consumeId = consumeId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public int getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(int consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public String getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(String consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "bean.MaterialConsume{" +
                "consumeId='" + consumeId + '\'' +
                ", workId='" + workId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", consumeAmount=" + consumeAmount +
                ", consumeDate='" + consumeDate + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

