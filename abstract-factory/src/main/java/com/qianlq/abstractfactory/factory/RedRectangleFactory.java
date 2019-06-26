package com.qianlq.abstractfactory.factory;

import com.qianlq.abstractfactory.object.color.Color;
import com.qianlq.abstractfactory.object.color.Red;
import com.qianlq.abstractfactory.object.shape.Rectangle;
import com.qianlq.abstractfactory.object.shape.Shape;

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