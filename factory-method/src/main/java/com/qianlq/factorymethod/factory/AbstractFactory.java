package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.demo.Shape;

/**
 * @author qianliqing
 * @date 2018/11/22 1:58 PM
 * email: qianlq0824@gmail.com
 */

public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Shape getShape(String args);

    public abstract Shape getShape(Object obj);
}
