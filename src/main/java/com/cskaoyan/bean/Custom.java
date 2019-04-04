package com.cskaoyan.bean;

public class Custom {
    String	customId;
    String	customName;
    String	fullName;
    String	address;
    String	fax;
    String	email;
    String	ownerName;
    String	ownerTel;
    int		status;
    String	note;

    public Custom() {
    }

    public Custom(String customId, String customName, String fullName, String address, String fax, String email, String ownerName, String ownerTel, int status, String note) {
        this.customId = customId;
        this.customName = customName;
        this.fullName = fullName;
        this.address = address;
        this.fax = fax;
        this.email = email;
        this.ownerName = ownerName;
        this.ownerTel = ownerTel;
        this.status = status;
        this.note = note;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "bean.Custom{" +
                "customId='" + customId + '\'' +
                ", customName='" + customName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerTel='" + ownerTel + '\'' +
                ", status=" + status +
                ", note='" + note + '\'' +
                '}';
    }
}
