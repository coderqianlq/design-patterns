package com.qianlq.bridge.example;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:38
 * mail: qianlq0824@gmail.com
 */

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
