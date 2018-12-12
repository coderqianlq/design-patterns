package cn.qianlq.bridge;

import cn.qianlq.bridge.example.Circle;
import cn.qianlq.bridge.example.Shape;
import cn.qianlq.bridge.object.ColorAPI;
import cn.qianlq.bridge.object.Green;
import cn.qianlq.bridge.object.Red;
import cn.qianlq.bridge.example.GreenCircle;
import cn.qianlq.bridge.example.RedCircle;
import cn.qianlq.bridge.util.XMLUtil;

import java.lang.reflect.Constructor;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:34
 * mail: qianlq0824@gmail.com
 */

public class BridgePatternDemo {

    public static void main(String[] args) throws Exception {
        cn.qianlq.bridge.object.Shape shape = new cn.qianlq.bridge.object.Circle(new Red());
        shape.draw();
        shape = new cn.qianlq.bridge.object.Rectangle(new Green());
        shape.draw();

        Class clazz = XMLUtil.getClass("shape");
        Constructor constructor = clazz.getConstructor(ColorAPI.class);

        cn.qianlq.bridge.object.Shape circle = (cn.qianlq.bridge.object.Shape) constructor.newInstance((ColorAPI) XMLUtil.getClass("color").newInstance());
        circle.draw();

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
