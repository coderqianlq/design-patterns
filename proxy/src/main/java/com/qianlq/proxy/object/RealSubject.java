package com.qianlq.proxy.object;

/**
 * @author CoderQian
 * @date 2019-02-02 11:09 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("request");
    }
}
