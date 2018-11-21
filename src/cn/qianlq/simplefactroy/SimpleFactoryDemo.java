package cn.qianlq.simplefactroy;


import cn.qianlq.simplefactroy.object.Shape;

/**
 * @author qianliqing
 * @date 2018/11/21 4:43 PM
 * email: qianliqing@hyperchain.com
 */

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();
    }
}
