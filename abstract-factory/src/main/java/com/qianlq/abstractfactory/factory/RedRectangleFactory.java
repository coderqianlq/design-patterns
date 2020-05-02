package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.demo.color.Color;
import com.qianlq.abstractfactory.demo.color.Red;
import com.qianlq.abstractfactory.demo.shape.Rectangle;
import com.qianlq.abstractfactory.demo.shape.Shape;

/**
 * @author CoderQian
 * @date 2018-11-24 6:52 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class RedRectangleFactory extends AbstractFactory {

    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
