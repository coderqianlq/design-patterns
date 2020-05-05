package com.qianlq.abstractfactory.demo.shape;

/**
 * @author CoderQian
 * @date 2018/4/8 下午4:26
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
