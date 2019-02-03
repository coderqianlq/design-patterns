package cn.qianlq.proxy.object;

/**
 * @author qianliqing
 * @date 2019-02-02 11:25 PM
 * mail: qianlq0824@gmail.com
 */

public class ProxySubject implements Subject {

    private RealSubject realSubject = new RealSubject();

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
