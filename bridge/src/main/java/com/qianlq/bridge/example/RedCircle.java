package com.qianlq.bridge.example;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:37
 * mail: qianlq0824@gmail.com
 */

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing [ color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
