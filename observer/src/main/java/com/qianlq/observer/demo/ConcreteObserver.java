package com.qianlq.observer.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if (subject.getState() != 0) {
            // do something
        } else {
            // do nothing
        }
    }
}
