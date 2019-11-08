package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.demo.Circle;
import com.qianlq.factorymethod.demo.Shape;

/**
 * @author qianliqing
 * @date 2018/4/8 下午4:29
 * email: qianlq0824@gmail.com
 */

public class CircleFactory extends AbstractFactory {

    /**
     * 返回具体的 Circle 实例
     *
     * @return Shape
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
