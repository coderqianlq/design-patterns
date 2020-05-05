package com.qianlq.abstractfactory;

import com.qianlq.abstractfactory.factory.BlueCircleFactory;
import com.qianlq.abstractfactory.factory.RedRectangleFactory;
import com.qianlq.abstractfactory.demo.color.Color;
import com.qianlq.abstractfactory.demo.shape.Shape;

/**
 * @author CoderQian
 * @date 2018/4/8 下午7:34
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

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
