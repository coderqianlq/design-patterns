package cn.qianlq.abstractfactory;

import cn.qianlq.abstractfactory.factory.AbstractFactory;
import cn.qianlq.abstractfactory.factory.ColorFactory;
import cn.qianlq.abstractfactory.factory.ShapeFactory;

/**
 * @author: qianliqing
 * @date: 2018/4/8 下午7:32
 * email: qianlq0824@gmail.com
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
