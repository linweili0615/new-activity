package com.activity.test.dto;

public class Project {
    private Integer p_id;
    private String p_name;

    public Project() {
    }

    public Project(Integer p_id, String p_name) {
        this.p_id = p_id;
        this.p_name = p_name;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                '}';
    }
}
