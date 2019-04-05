package com.cskaoyan.bean;

import java.util.List;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */

/**
 * 查询多条数据时使用返回值
 * @param <T>
 */
public class Tip2<T> {
    private Integer total;
    private List<T> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Tip2{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
