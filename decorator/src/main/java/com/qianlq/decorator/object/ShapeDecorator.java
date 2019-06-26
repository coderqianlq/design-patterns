package com.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-10-02 下午9:39
 * mail: qianlq0824@gmail.com
 */

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
