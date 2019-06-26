package com.qianlq.observer.object;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:47
 * mail: qianlq0824@gmail.com
 */

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
