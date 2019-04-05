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
    Material material;
    Work work;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public MaterialConsume() {
    }

    public MaterialConsume(String consumeId, String workId, String materialId, int consumeAmount, String consumeDate, String sender, String receiver, String note, Material material, Work work) {
        this.consumeId = consumeId;
        this.workId = workId;
        this.materialId = materialId;
        this.consumeAmount = consumeAmount;
        this.consumeDate = consumeDate;
        this.sender = sender;
        this.receiver = receiver;
        this.note = note;
        this.material = material;
        this.work = work;
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
        return "MaterialConsume{" +
                "consumeId='" + consumeId + '\'' +
                ", workId='" + workId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", consumeAmount=" + consumeAmount +
                ", consumeDate='" + consumeDate + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                ", material=" + material +
                ", work=" + work +
                '}';
    }
}

