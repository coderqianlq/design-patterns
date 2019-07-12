package com.qianlq.chain.example;

/**
 * @author qianliqing
 * @date 2019-06-28 11:53 PM
 * mail: qianlq0824@gmail.com
 */

public class ThirdHandler extends Handler {

    private void handle(String request) {
        System.out.println("Third Handle... " + request);
    }

    @Override
    public void handleRequest(String request) {
        // 最后一级处理，不设置nextHandler
        this.handle(request);
    }
}
