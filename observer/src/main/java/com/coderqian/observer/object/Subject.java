package com.coderqian.observer.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:45
 * mail: qianlq0824@gmail.com
 */

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
