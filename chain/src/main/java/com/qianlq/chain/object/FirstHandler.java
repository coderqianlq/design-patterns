package com.qianlq.chain.object;

/**
 * @author qianliqing
 * @date 2019-06-28 11:50 PM
 * mail: qianlq0824@gmail.com
 */

public class FirstHandler extends Handler {

    private void handle(String request) {
        System.out.println("First Handle... " + request);
    }

    @Override
    public void handleRequest(String request) {
        this.handle(request);
        this.nextHandler.handleRequest(request);
    }
}

