package cn.qianlq.prototype.object;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:30
 * email: qianlq0824@gmail.com
 */

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
