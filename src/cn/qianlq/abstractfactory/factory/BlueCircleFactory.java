package cn.qianlq.abstractfactory.factory;

import cn.qianlq.abstractfactory.object.color.Blue;
import cn.qianlq.abstractfactory.object.color.Color;
import cn.qianlq.abstractfactory.object.shape.Circle;
import cn.qianlq.abstractfactory.object.shape.Shape;

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
