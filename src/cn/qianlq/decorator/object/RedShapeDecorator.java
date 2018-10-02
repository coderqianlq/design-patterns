package cn.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-10-02 下午9:40
 * mail: qianlq0824@gmail.com
 */

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
