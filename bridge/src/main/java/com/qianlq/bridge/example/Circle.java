package com.qianlq.bridge.example;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:40
 * mail: qianlq0824@gmail.com
 */

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
