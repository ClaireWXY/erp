package com.cskaoyan.bean;

import java.util.List;

public class UnqualifyApplyVo {
    int total;
    List<PageUnQualifyList> rows;

    public UnqualifyApplyVo() {
    }

    public UnqualifyApplyVo(int total, List<PageUnQualifyList> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<PageUnQualifyList> getRows() {
        return rows;
    }

    public void setRows(List<PageUnQualifyList> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "UnqualifyApplyVo{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
