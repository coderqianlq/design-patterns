package com.qianlq.bridge.example;

/**
 * @author CoderQian
 * @date 2018-09-19 下午2:37
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing [ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
