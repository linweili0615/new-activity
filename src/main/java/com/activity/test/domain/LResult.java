package com.activity.test.domain;

import java.util.List;

public class LResult<T> {
    private String status;
    private String msg;
    private List<T> data;

    public LResult() {
    }

    public LResult(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public LResult(String status, String msg, List<T> data) {
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
