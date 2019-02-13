package com.coderqian.observer.object;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:51
 * mail: qianlq0824@gmail.com
 */

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
