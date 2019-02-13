package com.activity.test.dto;

public class ProjectExtend {
    private Integer e_id;
    private Integer p_id;
    private String branch;
    private String md5;
    private String modify_content;
    private String modify_tester;
    private String modify_date;
    private String status;

    public ProjectExtend() {
    }

    public ProjectExtend(Integer e_id, Integer p_id, String branch, String md5, String modify_content, String modify_tester, String modify_date, String status) {
        this.e_id = e_id;
        this.p_id = p_id;
        this.branch = branch;
        this.md5 = md5;
        this.modify_content = modify_content;
        this.modify_tester = modify_tester;
        this.modify_date = modify_date;
        this.status = status;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getModify_tester() {
        return modify_tester;
    }

    public void setModify_tester(String modify_tester) {
        this.modify_tester = modify_tester;
    }

    public String getModify_content() {
        return modify_content;
    }

    public void setModify_content(String modify_content) {
        this.modify_content = modify_content;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ProjectExtend{" +
                "e_id=" + e_id +
                ", p_id=" + p_id +
                ", branch='" + branch + '\'' +
                ", md5='" + md5 + '\'' +
                ", modify_content='" + modify_content + '\'' +
                ", modify_tester='" + modify_tester + '\'' +
                ", modify_date='" + modify_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
