package com.cskaoyan.bean;

public class MaterialReceive {
    String	receiveId;
    String	materialId;
    int		amount;
    String	receiveDate;
    String	sender;
    String	receiver;
    String	note;

    public MaterialReceive() {
    }

    public MaterialReceive(String receiveId, String materialId, int amount, String receiveDate, String sender, String receiver, String note) {
        this.receiveId = receiveId;
        this.materialId = materialId;
        this.amount = amount;
        this.receiveDate = receiveDate;
        this.sender = sender;
        this.receiver = receiver;
        this.note = note;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
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
        return "bean.MaterialReceive{" +
                "receiveId='" + receiveId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", amount=" + amount +
                ", receiveDate='" + receiveDate + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
