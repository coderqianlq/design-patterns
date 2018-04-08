package cn.qianlq.abstractfactory.factory;

import cn.qianlq.abstractfactory.object.color.Color;
import cn.qianlq.abstractfactory.object.shape.Circle;
import cn.qianlq.abstractfactory.object.shape.Rectangle;
import cn.qianlq.abstractfactory.object.shape.Shape;
import cn.qianlq.abstractfactory.object.shape.Square;

/**
 * @author: qianliqing
 * @date: 2018/4/8 下午4:29
 * email: qianlq0824@gmail.com
 */

public class ShapeFactory extends AbstractFactory{

    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType
     * @return
     */
    @Override
    public Shape getShape(String shapeType) {
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
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
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
