package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.demo.Rectangle;
import com.qianlq.factorymethod.demo.Shape;

/**
 * @author qianliqing
 * @date 2018/11/22 2:03 PM
 * email: qianlq0824@gmail.com
 */

public class RectangleFactory extends AbstractFactory {

    /**
     * 返回具体的 Rectangle 实例
     *
     * @return Shape
     */
    @Override
    public Shape getShape() {
        return new Rectangle();
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
