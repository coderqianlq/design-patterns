package com.qianlq.observer.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //this.notifyAllObservers();
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
