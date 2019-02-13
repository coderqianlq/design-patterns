package com.coderqian.observer.object;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:48
 * mail: qianlq0824@gmail.com
 */

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
