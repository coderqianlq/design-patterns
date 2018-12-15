package cn.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-10-02 下午9:40
 * mail: qianlq0824@gmail.com
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
