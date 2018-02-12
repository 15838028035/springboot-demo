package com.demo.springboot.vo;

import java.util.List;

/**
 * @author morning
 * @date 2018 02 11 16:06
 */
public class PageVO<T> {
    private Integer pageSize;
    private Integer pageNo;
    private Long totalNum;
    private List<T> data;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageVO{" + "pageSize=" + pageSize + ", pageNo=" + pageNo + ", totalNum=" + totalNum
                + ", data=" + data + '}';
    }
}
