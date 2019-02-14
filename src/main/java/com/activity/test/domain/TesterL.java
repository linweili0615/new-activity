package com.activity.test.domain;

public class TesterL {
    private String value;
    private String label;

    public TesterL() {
    }

    public TesterL(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
