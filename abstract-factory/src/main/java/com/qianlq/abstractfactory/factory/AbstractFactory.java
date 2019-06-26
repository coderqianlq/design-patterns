package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.object.color.Color;
import com.qianlq.abstractfactory.object.shape.Shape;

/**
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 */

/**
 * @author qianliqing
 * @date 2018/4/8 下午5:39
 * email: qianlq0824@gmail.com
 */

public abstract class AbstractFactory {

    public abstract Color getColor();

    public abstract Shape getShape();
}
