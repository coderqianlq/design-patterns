package cn.qianlq.factory;

import cn.qianlq.factory.object.Rectangle;
import cn.qianlq.factory.object.Shape;
import cn.qianlq.factory.object.Square;

/**
 * @author qianliqing
 * @date 2018/4/8 下午4:27
 * email: qianlq0824@gmail.com
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        Rectangle rect = ShapeFactory.getClass(Rectangle.class);
        rect.draw();

        Square square = ShapeFactory.getClass(Square.class);
        square.draw();
    }
}
