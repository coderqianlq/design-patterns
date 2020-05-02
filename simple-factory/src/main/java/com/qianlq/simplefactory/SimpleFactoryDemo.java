package com.qianlq.simplefactory;

import com.qianlq.simplefactory.factory.ShapeFactory;
import com.qianlq.simplefactory.demo.Circle;
import com.qianlq.simplefactory.demo.Shape;
import com.qianlq.util.XMLUtil;

/**
 * @author CoderQian
 * @date 2018/11/21 4:43 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape shape = ShapeFactory.getShape(XMLUtil.getBean("simple-factory/src/main/resources/config/config.xml", "shapeType"));
        assert shape != null;
        shape.draw();

        shape = ShapeFactory.getClass(Circle.class);
        shape.draw();
    }
}
