package cn.qianlq.facade.object;

/**
 * @author qianliqing
 * @date 2018-11-18 8:43 PM
 * mail: qianlq0824@gmail.com
 */

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}