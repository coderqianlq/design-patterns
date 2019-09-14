package com.qianlq.abstractfactory.demo.shape;

/**
 * @author qianliqing
 * @date 2018/4/8 下午4:28
 * email: qianlq0824@gmail.com
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
