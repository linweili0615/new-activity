package com.activity.test.domain;

import com.activity.test.dto.ProjectExtend;

import java.util.List;

public class ProjectExtendResult{
    private String status;
    private String msg;
    private List<ProjectExtend> data;
    private long total;
    private long pageCount;
    private Integer pageSize;
    private Integer pageNo;

    public ProjectExtendResult(String status, String msg, List<ProjectExtend> data, long total, long pageCount, Integer pageSize, Integer pageNo) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.total = total;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public ProjectExtendResult(String status, String msg) {
        this.status = status;
        this.msg = msg;
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

    public List<ProjectExtend> getData() {
        return data;
    }

    public void setData(List<ProjectExtend> data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

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

    @Override
    public String toString() {
        return "ProjectExtendResult{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", total=" + total +
                ", pageCount=" + pageCount +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
