package cn.qianlq.abstractfactory.factory;

import cn.qianlq.abstractfactory.object.color.Blue;
import cn.qianlq.abstractfactory.object.color.Color;
import cn.qianlq.abstractfactory.object.color.Green;
import cn.qianlq.abstractfactory.object.color.Red;
import cn.qianlq.abstractfactory.object.shape.Shape;

/**
 * @author qianliqing
 * @date 2018/4/8 下午5:43
 * email: qianlq0824@gmail.com
 */

public class ColorFactory extends AbstractFactory {

    /**
     * @param shape
     * @return
     */
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    /**
     * 使用 getColor 方法获取形状类型的对象
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
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