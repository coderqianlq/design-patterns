package com.qianlq.flyweight;

import com.qianlq.flyweight.object.Circle;
import com.qianlq.flyweight.object.ShapeFactory;

/**
 * @author CoderQian
 * @date 2018-12-30 8:50 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 * @description 享元模式通常与其它模式（比如工厂模式）配合使用
 */

public class Main {

    private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
}
