package com.qianlq.bridge.demo;

/**
 * @author CoderQian
 * @date 2018/12/11 5:33 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Rectangle extends Shape {

    public Rectangle(ColorApi colorApi) {
        super(colorApi);
    }

    @Override
    public void draw() {
        System.out.print("draw rectangle, ");
        colorApi.drawColor();
    }
}
