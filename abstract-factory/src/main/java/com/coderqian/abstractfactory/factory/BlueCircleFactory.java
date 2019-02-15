package com.coderqian.abstractfactory.factory;

import com.coderqian.abstractfactory.object.color.Blue;
import com.coderqian.abstractfactory.object.color.Color;
import com.coderqian.abstractfactory.object.shape.Circle;
import com.coderqian.abstractfactory.object.shape.Shape;

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
