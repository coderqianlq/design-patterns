package com.coderqian.factorymethod.factory;

import com.coderqian.factorymethod.object.Rectangle;
import com.coderqian.factorymethod.object.Shape;

/**
 * @author qianliqing
 * @date 2018/11/22 2:03 PM
 * email: qianlq0824@gmail.com
 */

public class RectangleFactory extends AbstractFactory {

    /**
     * 返回具体的 Rectangle 实例
     *
     * @return
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
