package com.qianlq.observer.object;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:49
 * mail: qianlq0824@gmail.com
 */

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
