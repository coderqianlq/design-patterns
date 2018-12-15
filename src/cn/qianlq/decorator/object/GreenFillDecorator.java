package cn.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-12-15 2:25 PM
 * mail: qianlq0824@gmail.com
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
