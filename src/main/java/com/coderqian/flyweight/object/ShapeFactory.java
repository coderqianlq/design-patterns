package com.coderqian.flyweight.object;

import java.util.HashMap;

/**
 * @author qianliqing
 * @date 2018-12-30 8:52 PM
 * mail: qianlq0824@gmail.com
 */

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
