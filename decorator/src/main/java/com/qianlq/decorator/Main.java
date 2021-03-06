package com.qianlq.decorator;

import com.qianlq.decorator.object.*;

/**
 * @author CoderQian
 * @date 2018-10-02 下午8:24
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedBorderDecorator(circle);

        Shape redRectangle = new RedBorderDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("\nCircle of red border and red padding");
        Shape fillRedCircle = new RedFillDecorator(redCircle);
        fillRedCircle.draw();

        System.out.println("\nRectangle of red border and green padding");
        Shape fillGreenRectangle = new GreenFillDecorator((RedBorderDecorator) redRectangle);
        fillGreenRectangle.draw();
    }
}
