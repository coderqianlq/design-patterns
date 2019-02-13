package com.coderqian.abstractfactory.object.color;

/**
 * @author qianliqing
 * @date 2018/4/8 下午5:37
 * email: qianlq0824@gmail.com
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}