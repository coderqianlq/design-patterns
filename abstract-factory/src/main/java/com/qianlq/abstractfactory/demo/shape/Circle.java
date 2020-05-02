package com.qianlq.abstractfactory.demo.shape;

/**
 * @author CoderQian
 * @date 2018/4/8 下午4:28
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
