package com.qianlq.decorator.object;

/**
 * @author CoderQian
 * @date 2018-12-15 2:25 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class GreenFillDecorator extends RedBorderDecorator {

    public GreenFillDecorator(RedBorderDecorator borderDecorator) {
        super(borderDecorator);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        fill();
    }

    private void fill() {
        System.out.println("Fill Color: Green");
    }
}
