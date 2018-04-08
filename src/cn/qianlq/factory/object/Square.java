package cn.qianlq.factory.object;

/**
 * @author: qianliqing
 * @date: 2018/4/8 下午4:26
 * email: qianlq0824@gmail.com
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
