package com.mariuspurici.dashboardapplication;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }
}
