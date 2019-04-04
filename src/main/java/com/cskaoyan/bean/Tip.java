package com.cskaoyan.bean;

/**
 * @author Wang Xueyang
 * @create 2019-04-04
 */
public class Tip {
     private String status;
     private String msg;
     private String data;

     public Tip() {
     }

     public Tip(String status, String msg, String data) {
          this.status = status;
          this.msg = msg;
          this.data = data;
     }

     public String getStatus() {
          return status;
     }

     public void setStatus(String status) {
          this.status = status;
     }

     public String getMsg() {
          return msg;
     }

     public void setMsg(String msg) {
          this.msg = msg;
     }

     public String getData() {
          return data;
     }

     public void setData(String data) {
          this.data = data;
     }

     @Override
     public String toString() {
          return "Tip{" +
                  "status='" + status + '\'' +
                  ", msg='" + msg + '\'' +
                  ", data='" + data + '\'' +
                  '}';
     }
}
