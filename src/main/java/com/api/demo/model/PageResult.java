package com.api.demo.model;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> extends ListResult<T> {
    private Long currentPage=1L;
    private Long pageSize=1L;
    private Long totalCount=1L;
    private List resultObject=new ArrayList();

    public PageResult() {
    }



    public PageResult(Long pageSize, Long currentPage) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }


    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }



    public List getResultObject() {
        return resultObject;
    }

    public void setResultObject(List resultObject) {
        this.resultObject = resultObject;
    }
}
