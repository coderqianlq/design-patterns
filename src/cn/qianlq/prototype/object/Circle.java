package cn.qianlq.prototype.object;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:31
 * email: qianlq0824@gmail.com
 */

public class Circle extends Shape {

    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}