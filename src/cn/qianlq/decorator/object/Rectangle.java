package cn.qianlq.decorator.object;

/**
 * @author qianliqing
 * @date 2018-10-02 下午9:37
 * mail: qianlq0824@gmail.com
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
