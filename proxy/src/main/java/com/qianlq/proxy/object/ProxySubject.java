package com.qianlq.proxy.object;

/**
 * @author CoderQian
 * @date 2019-02-02 11:25 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class ProxySubject implements Subject {

    private final RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("preRequest");
    }

    private void postRequest() {
        System.out.println("postRequest");
    }
}
