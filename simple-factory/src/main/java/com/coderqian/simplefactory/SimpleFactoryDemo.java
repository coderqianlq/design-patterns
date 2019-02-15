package com.coderqian.simplefactory;

import com.coderqian.simplefactory.factory.ShapeFactory;
import com.coderqian.simplefactory.object.Circle;
import com.coderqian.simplefactory.object.Shape;
import com.coderqian.util.XMLUtil;

/**
 * @author qianliqing
 * @date 2018/11/21 4:43 PM
 * email: qianlq0824@gmail.com
 */

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape shape = ShapeFactory.getShape(XMLUtil.getBean("simple-factory/src/main/java/com/coderqian/simplefactory/config/config.xml", "shapeType"));
        shape.draw();

        shape = ShapeFactory.getClass(Circle.class);
        shape.draw();
    }
}
