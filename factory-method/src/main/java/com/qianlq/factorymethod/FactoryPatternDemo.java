package com.qianlq.factorymethod;

import com.qianlq.factorymethod.factory.AbstractFactory;
import com.qianlq.factorymethod.factory.CircleFactory;
import com.qianlq.factorymethod.factory.RectangleFactory;
import com.qianlq.factorymethod.factory.SquareFactory;
import com.qianlq.factorymethod.object.Shape;
import com.qianlq.util.XMLUtil;

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

        factory = (AbstractFactory) XMLUtil.getObject("factory-method/src/main/java/com/coderqian/factorymethod/config/config.xml", "className");
        Shape shape = factory.getShape();
        shape.draw();
    }
}
