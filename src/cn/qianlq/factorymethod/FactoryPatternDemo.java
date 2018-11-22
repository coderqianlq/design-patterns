package cn.qianlq.factorymethod;

import cn.qianlq.factorymethod.factory.AbstractFactory;
import cn.qianlq.factorymethod.factory.CircleFactory;
import cn.qianlq.factorymethod.factory.RectangleFactory;
import cn.qianlq.factorymethod.factory.SquareFactory;
import cn.qianlq.factorymethod.object.Shape;
import cn.qianlq.factorymethod.util.XMLUtil;

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

        factory = (AbstractFactory) XMLUtil.getFactory();
        Shape shape = factory.getShape();
        shape.draw();
    }
}
