package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.demo.Circle;
import com.qianlq.factorymethod.demo.Shape;

/**
 * @author CoderQian
 * @date 2018/4/8 下午4:29
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class CircleFactory extends AbstractFactory {

    /**
     * 返回具体的 Circle 实例
     *
     * @return Circle
     */
    @Override
    public Shape getShape() {
        return new Circle();
    }

    @Override
    public Shape getShape(String args) {
        return null;
    }

    @Override
    public Shape getShape(Object obj) {
        return null;
    }
}
