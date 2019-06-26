package com.qianlq.prototype.object;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:29
 * email: qianlq0824@gmail.com
 */

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
