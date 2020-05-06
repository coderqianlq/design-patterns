package com.qianlq.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public abstract class Subject {

    /**
     * 定义一个观察者集合用于存储所有观察者对象
     */
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 注册方法，用于向观察者集合中添加观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 注销方法，用于在观察者集合中移除观察者
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 声明抽象通知方法
     */
    public abstract void notifyAllObservers();
}
