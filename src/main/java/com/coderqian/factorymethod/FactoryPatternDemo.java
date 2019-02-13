package com.coderqian.factorymethod;

import com.coderqian.factorymethod.factory.AbstractFactory;
import com.coderqian.factorymethod.factory.CircleFactory;
import com.coderqian.factorymethod.factory.RectangleFactory;
import com.coderqian.factorymethod.factory.SquareFactory;
import com.coderqian.factorymethod.object.Shape;
import com.util.XMLUtil;

/**
 * @author qianliqing
 * @date 2018/4/8 下午4:27
 * email: qianlq0824@gmail.com
 */

public class FactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory factory;
        factory = new CircleFactory();
        Shape circle = factory.getShape();
        circle.draw();

        factory = new RectangleFactory();
        Shape rectangle = factory.getShape();
        rectangle.draw();

        factory = new SquareFactory();
        Shape square = factory.getShape();
        square.draw();

        factory = (AbstractFactory) XMLUtil.getObejct("src/cn/qianlq/factorymethod/config/config.xml", "className");
        Shape shape = factory.getShape();
        shape.draw();
    }
}
