package com.coderqian.bridge.object;

/**
 * @author qianliqing
 * @date 2018/12/11 5:33 PM
 * email: qianlq0824@gmail.com
 */

public class Rectangle extends Shape {

    public Rectangle(ColorAPI colorAPI) {
        super(colorAPI);
    }

    @Override
    public void draw() {
        System.out.print("draw rectangle, ");
        colorAPI.drawColor();
    }
}