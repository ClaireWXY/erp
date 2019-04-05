package com.cskaoyan.bean;

import java.util.List;

public class TotalAndList {
    int total;
    List<?> rows;

    public TotalAndList() {
    }

    public TotalAndList(int total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "TotalAndList{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
