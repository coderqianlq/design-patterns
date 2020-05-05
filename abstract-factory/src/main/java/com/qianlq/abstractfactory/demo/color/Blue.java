package com.qianlq.abstractfactory.demo.color;

/**
 * @author CoderQian
 * @date 2018/4/8 下午5:37
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
