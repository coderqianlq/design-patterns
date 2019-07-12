package com.qianlq.chain.example;

/**
 * @author qianliqing
 * @date 2019-06-28 11:35 PM
 * mail: qianlq0824@gmail.com
 */

public abstract class Handler {

    // 保持下一级元素的引用
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
