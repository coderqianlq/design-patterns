package com.qianlq.chain.example;

/**
 * @author CoderQian
 * @date 2019-06-28 11:50 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
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

