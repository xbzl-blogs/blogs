package com.whiteroad.database.query;

import java.util.Map;

/**
 * @author Da
 * @date 2020/4/17 9:06
 */
public class QuerySchema {
    /**
     * 简单查询条件
     */
    private Map<String, Object> criterion;
    /**
     * 当前页 默认0
     */
    private int pageNumber = 0;
    /**
     * 页面大小 默认20
     */
    private int pageSize = 20;

    public Map<String, Object> getCriterion() {
        return criterion;
    }

    public void setCriterion(Map<String, Object> criterion) {
        this.criterion = criterion;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
