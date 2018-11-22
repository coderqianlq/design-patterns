package cn.qianlq.simplefactory;


import cn.qianlq.simplefactory.object.Circle;
import cn.qianlq.simplefactory.object.Shape;
import cn.qianlq.simplefactory.util.XMLUtil;

/**
 * @author qianliqing
 * @date 2018/11/21 4:43 PM
 * email: qianliqing@hyperchain.com
 */

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();

        Shape shape =  ShapeFactory.getShape(XMLUtil.getChartType());
        shape.draw();

        shape = ShapeFactory.getClass(Circle.class);
        shape.draw();
    }
}
