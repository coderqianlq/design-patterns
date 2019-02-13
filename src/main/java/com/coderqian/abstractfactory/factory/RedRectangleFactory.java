package com.coderqian.abstractfactory.factory;

import com.coderqian.abstractfactory.object.color.Color;
import com.coderqian.abstractfactory.object.color.Red;
import com.coderqian.abstractfactory.object.shape.Rectangle;
import com.coderqian.abstractfactory.object.shape.Shape;

/**
 * @author qianliqing
 * @date 2018-11-24 6:52 PM
 * mail: qianlq0824@gmail.com
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
