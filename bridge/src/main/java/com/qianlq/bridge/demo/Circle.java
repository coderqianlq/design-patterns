package com.qianlq.bridge.demo;

/**
 * @author CoderQian
 * @date 2018/12/11 5:26 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Circle extends Shape {

    public Circle(ColorApi colorApi) {
        super(colorApi);
    }

    @Override
    public void draw() {
        System.out.print("draw circle, ");
        colorApi.drawColor();
    }
}
