package com.coderqian.bridge;

import com.coderqian.bridge.example.Circle;
import com.coderqian.bridge.example.GreenCircle;
import com.coderqian.bridge.example.RedCircle;
import com.coderqian.bridge.example.Shape;
import com.coderqian.bridge.object.ColorAPI;
import com.coderqian.bridge.object.Green;
import com.coderqian.bridge.object.Red;
import com.coderqian.util.XMLUtil;

import java.lang.reflect.Constructor;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:34
 * mail: qianlq0824@gmail.com
 */

public class BridgePatternDemo {

    public static void main(String[] args) throws Exception {
        com.coderqian.bridge.object.Shape shape = new com.coderqian.bridge.object.Circle(new Red());
        shape.draw();
        shape = new com.coderqian.bridge.object.Rectangle(new Green());
        shape.draw();

        Class clazz = XMLUtil.getClass("bridge/src/main/java/com/coderqian/bridge/config/config.xml", "shape");
        Constructor constructor = clazz.getConstructor(ColorAPI.class);

        com.coderqian.bridge.object.Shape circle = (com.coderqian.bridge.object.Shape) constructor.newInstance((ColorAPI) XMLUtil.getObject("bridge/src/main/java/com/coderqian/bridge/config/config.xml", "color"));
        circle.draw();

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
