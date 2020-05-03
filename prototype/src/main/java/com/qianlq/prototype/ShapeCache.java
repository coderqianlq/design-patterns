package com.qianlq.prototype;

import com.qianlq.prototype.object.Circle;
import com.qianlq.prototype.object.Rectangle;
import com.qianlq.prototype.object.Shape;
import com.qianlq.prototype.object.Square;

import java.util.Hashtable;

/**
 * @author CoderQian
 * @date 2018/4/8 下午2:34
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状shapeMap.put(shapeKey, shape);
     * 例如，我们要添加三种形状
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
