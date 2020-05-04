package com.qianlq.proxy;

import com.qianlq.proxy.example.CglibProxy;
import com.qianlq.proxy.example.JdkProxy;
import com.qianlq.proxy.object.RealSubject;
import com.qianlq.proxy.object.Subject;
import com.qianlq.proxy.object.ProxySubject;

/**
 * @author CoderQian
 * @date 2019-02-02 10:31 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("传统方式");
        Subject subject = new ProxySubject();
        subject.request();

        Subject realSubject = new RealSubject();

        System.out.println("\nJdk代理的方式:");
        JdkProxy jdkProxy = new JdkProxy();
        Subject jdkSubject = jdkProxy.newProxy(realSubject);
        jdkSubject.request();

        System.out.println("\nCglib代理的方式:");
        CglibProxy cglibProxy = new CglibProxy();
        Subject cglibSubject = (Subject) cglibProxy.createProxyObject(realSubject);
        cglibSubject.request();
    }
}
