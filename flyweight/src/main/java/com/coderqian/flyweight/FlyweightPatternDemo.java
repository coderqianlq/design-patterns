package com.coderqian.flyweight;

import com.coderqian.flyweight.object.Circle;
import com.coderqian.flyweight.object.ShapeFactory;

/**
 * @author qianliqing
 * @date 2018-12-30 8:50 PM
 * mail: qianlq0824@gmail.com
 */

public class FlyweightPatternDemo {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
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
