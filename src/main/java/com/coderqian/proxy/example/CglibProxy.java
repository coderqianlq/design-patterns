package com.coderqian.proxy.example;

//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;


/**
 * @author qianliqing
 * @date 2019-02-03 9:43 PM
 * mail: qianlq0824@gmail.com
 */

//public class CglibProxy implements MethodInterceptor {
//
//    // CGlib需要代理的目标对象
//    private Subject realSubject;
//
//    public Object createProxyObject(Subject subject) {
//        this.realSubject = subject;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(subject.getClass());
//        enhancer.setCallback(this);
//        Object proxyObj = enhancer.create();
//        return proxyObj;
//    }
//
//    @Override
//    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//        System.out.println("调用代理类");
//        Object obj;
//        if ("request".equals(method.getName())) {
//            obj = method.invoke(realSubject, args);
//            System.out.println("调用request方法");
//        } else {
//            obj = method.invoke(realSubject, args);
//            System.out.println("调用其它方法");
//        }
//        return obj;
//    }
//}
