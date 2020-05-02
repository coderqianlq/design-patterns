package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.demo.color.Blue;
import com.qianlq.abstractfactory.demo.color.Color;
import com.qianlq.abstractfactory.demo.shape.Circle;
import com.qianlq.abstractfactory.demo.shape.Shape;

/**
 * @author CoderQian
 * @date 2018-11-24 6:50 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
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
