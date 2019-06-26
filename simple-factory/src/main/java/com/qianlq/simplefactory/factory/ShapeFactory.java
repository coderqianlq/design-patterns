package com.qianlq.simplefactory.factory;

import com.qianlq.simplefactory.object.Circle;
import com.qianlq.simplefactory.object.Rectangle;
import com.qianlq.simplefactory.object.Shape;
import com.qianlq.simplefactory.object.Square;

/**
 * @author qianliqing
 * @date 2018/11/21 4:41 PM
 * email: qianlq0824@gmail.com
 */

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    /**
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
