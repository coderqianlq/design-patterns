package com.qianlq.prototype.object;

/**
 * @author CoderQian
 * @date 2018/4/8 下午2:31
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
