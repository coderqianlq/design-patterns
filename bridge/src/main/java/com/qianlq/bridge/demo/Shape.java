package com.qianlq.bridge.demo;

/**
 * @author CoderQian
 * @date 2018/12/11 5:24 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public abstract class Shape {

    protected ColorApi colorApi;

    public Shape(ColorApi colorApi) {
        this.colorApi = colorApi;
    }

    public abstract void draw();
}
