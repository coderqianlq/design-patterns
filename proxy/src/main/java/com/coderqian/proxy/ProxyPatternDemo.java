package com.coderqian.proxy;

import com.coderqian.proxy.example.CglibProxy;
import com.coderqian.proxy.example.JdkProxy;
import com.coderqian.proxy.object.RealSubject;
import com.coderqian.proxy.object.Subject;
import com.coderqian.proxy.object.ProxySubject;

/**
 * @author qianliqing
 * @date 2019-02-02 10:31 PM
 * mail: qianlq0824@gmail.com
 */

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();

        Subject realSubject = new RealSubject();

        JdkProxy jdkProxy = new JdkProxy();
        Subject jdkSubject = jdkProxy.newProxy(realSubject);
        jdkSubject.request();

        CglibProxy cglibProxy = new CglibProxy();
        Subject cglibSubject = (Subject) cglibProxy.createProxyObject(realSubject);
        cglibSubject.request();
    }
}
