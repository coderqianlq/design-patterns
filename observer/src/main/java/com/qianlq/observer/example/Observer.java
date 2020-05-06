package com.qianlq.observer.example;

/**
 * @author CoderQian
 * @date 2018-10-08 下午8:47
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
