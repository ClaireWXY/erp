package com.cskaoyan.bean;

public class SysUser {
    String	id;
    String	username;
    String	password;
    String	locked;

    public SysUser() {
    }

    public SysUser(String id, String username, String password, String locked) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.locked = locked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "bean.SysUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", locked='" + locked + '\'' +
                '}';
    }
}
