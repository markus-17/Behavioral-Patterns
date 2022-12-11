package com.mariuspurici.dashboardapplication;

public class DashBoard implements Observer {
    private int id;
    protected String observerState;
    protected DataSource dataSource;

    public DashBoard(int id, DataSource dataSource) {
        dataSource.attach(this);
        this.dataSource = dataSource;
        this.id = id;
    }

    @Override
    public void update() {
        this.observerState = dataSource.getState();
        System.out.println("The dashboard with id " + this.id + " has been updated the state is now " + this.observerState);
    }
}
