package cn.qianlq.simplefactory;


import cn.qianlq.simplefactory.factory.ShapeFactory;
import cn.qianlq.simplefactory.object.Circle;
import cn.qianlq.simplefactory.object.Shape;
import cn.util.XMLUtil;

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

        Shape shape = ShapeFactory.getShape(XMLUtil.getBean("src/cn/qianlq/simplefactory/config/config.xml", "shapeType"));
        shape.draw();

        shape = ShapeFactory.getClass(Circle.class);
        shape.draw();
    }
}
