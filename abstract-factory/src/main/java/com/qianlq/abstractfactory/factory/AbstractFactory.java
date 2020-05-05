package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.demo.color.Color;
import com.qianlq.abstractfactory.demo.shape.Shape;

/**
 * @author CoderQian
 * @date 2018/4/8 下午5:39
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 * @description 为 Color 和 Shape 对象创建抽象类来获取工厂
 */

public abstract class AbstractFactory {

    public abstract Color getColor();

    public abstract Shape getShape();
}
