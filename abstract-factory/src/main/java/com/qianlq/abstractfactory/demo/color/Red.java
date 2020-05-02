package com.qianlq.abstractfactory.demo.color;

/**
 * @author CoderQian
 * @date 2018/4/8 下午5:36
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
