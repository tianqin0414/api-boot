package com.api.demo.model;


import java.util.ArrayList;
import java.util.List;

public class ListResult<T> extends BaseResult {
    private static final long serialVersionUID = 5741020370203813418L;
    /**
     * 当前返回的数据列表，其数目可以等于count，也可以小于count（分页时）
     */
    private List<T> data=new ArrayList<>();

    /**
     * 根据查询条件可以获得的所有数据总条数
     */

    private int count;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
