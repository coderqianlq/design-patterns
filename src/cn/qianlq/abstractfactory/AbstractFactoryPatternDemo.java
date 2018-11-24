package cn.qianlq.abstractfactory;

import cn.qianlq.abstractfactory.factory.BlueCircleFactory;
import cn.qianlq.abstractfactory.factory.RedRectangleFactory;
import cn.qianlq.abstractfactory.object.color.Color;
import cn.qianlq.abstractfactory.object.shape.Shape;

/**
 * @author qianliqing
 * @date 2018/4/8 下午7:34
 * email: qianlq0824@gmail.com
 */

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        BlueCircleFactory bcf = new BlueCircleFactory();

        Shape circle = bcf.getShape();
        circle.draw();

        Color blue = bcf.getColor();
        blue.fill();

        RedRectangleFactory rrf = new RedRectangleFactory();

        Shape rectangle = rrf.getShape();
        rectangle.draw();

        Color red = rrf.getColor();
        red.fill();
    }
}
