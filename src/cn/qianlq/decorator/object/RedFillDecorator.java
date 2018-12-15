package cn.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-12-15 2:02 PM
 * mail: qianlq0824@gmail.com
 */

public class RedFillDecorator extends ShapeDecorator {

    public RedFillDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        fill();
    }

    private void fill() {
        System.out.println("Fill Color: Red");
    }
}
