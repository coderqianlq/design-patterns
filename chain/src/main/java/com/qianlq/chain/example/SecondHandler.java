package com.qianlq.chain.example;

/**
 * @author qianliqing
 * @date 2019-06-28 11:51 PM
 * mail: qianlq0824@gmail.com
 */

public class SecondHandler extends Handler {

    private void handle(String request) {
        System.out.println("Second Handle... " + request);
    }

    @Override
    public void handleRequest(String request) {
        this.handle(request);
        this.nextHandler.handleRequest(request);
    }
}
