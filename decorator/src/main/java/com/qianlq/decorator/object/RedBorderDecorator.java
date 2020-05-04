package com.qianlq.decorator.object;

/**
 * @author CoderQian
 * @date 2018-10-02 下午9:40
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class RedBorderDecorator extends ShapeDecorator {

    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
