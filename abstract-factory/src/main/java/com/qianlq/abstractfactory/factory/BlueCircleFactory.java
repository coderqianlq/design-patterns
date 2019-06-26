package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.object.color.Blue;
import com.qianlq.abstractfactory.object.color.Color;
import com.qianlq.abstractfactory.object.shape.Circle;
import com.qianlq.abstractfactory.object.shape.Shape;

/**
 * @author qianliqing
 * @date 2018-11-24 6:50 PM
 * mail: qianlq0824@gmail.com
 */

public class BlueCircleFactory extends AbstractFactory {

    @Override
    public Color getColor() {
        return new Blue();
    }

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
