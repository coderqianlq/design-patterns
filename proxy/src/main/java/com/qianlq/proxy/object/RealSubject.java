package com.qianlq.proxy.object;

/**
 * @author qianliqing
 * @date 2019-02-02 11:09 PM
 * mail: qianlq0824@gmail.com
 */

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request");
    }
}
