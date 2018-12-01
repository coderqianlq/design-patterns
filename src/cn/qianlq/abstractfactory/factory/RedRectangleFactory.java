package cn.qianlq.abstractfactory.factory;

import cn.qianlq.abstractfactory.object.color.Color;
import cn.qianlq.abstractfactory.object.color.Red;
import cn.qianlq.abstractfactory.object.shape.Rectangle;
import cn.qianlq.abstractfactory.object.shape.Shape;

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
