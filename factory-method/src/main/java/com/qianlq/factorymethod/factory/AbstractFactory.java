package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.demo.Shape;

/**
 * @author CoderQian
 * @date 2018/11/22 1:58 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Shape getShape(String args);

    public abstract Shape getShape(Object obj);
}
