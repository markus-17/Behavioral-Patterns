package com.mariuspurici.dashboardapplication;

public class DataSource extends Subject {
    public String subjectState;

    public String getState() {
        return this.subjectState;
    }

    public void setState(String state) {
        this.subjectState = state;
    }
}
