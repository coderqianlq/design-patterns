package com.qianlq.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @date 2018-10-08 下午8:45
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Subject {

    /**
     * 观察者链表
     */
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
        // 遍历观察者并进行通知
        for (Observer observer : observers) {
            observer.update();
        }
        // lambda: observers.forEach(Observer::update);
    }
}
