package com.qianlq.bridge;

import com.qianlq.bridge.example.Circle;
import com.qianlq.bridge.example.GreenCircle;
import com.qianlq.bridge.example.RedCircle;
import com.qianlq.bridge.example.Shape;
import com.qianlq.bridge.object.ColorAPI;
import com.qianlq.bridge.object.Green;
import com.qianlq.bridge.object.Red;
import com.qianlq.util.XMLUtil;

import java.lang.reflect.Constructor;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:34
 * mail: qianlq0824@gmail.com
 */

public class BridgePatternDemo {

    public static void main(String[] args) throws Exception {
        com.qianlq.bridge.object.Shape shape = new com.qianlq.bridge.object.Circle(new Red());
        shape.draw();
        shape = new com.qianlq.bridge.object.Rectangle(new Green());
        shape.draw();

        Class clazz = XMLUtil.getClass("bridge/src/main/java/com/coderqian/bridge/config/config.xml", "shape");
        Constructor constructor = clazz.getConstructor(ColorAPI.class);

        com.qianlq.bridge.object.Shape circle = (com.qianlq.bridge.object.Shape) constructor.newInstance((ColorAPI) XMLUtil.getObject("bridge/src/main/java/com/coderqian/bridge/config/config.xml", "color"));
        circle.draw();

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
