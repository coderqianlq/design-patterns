package cn.qianlq.bridge.object;

/**
 * @author qianliqing
 * @date 2018/12/11 5:26 PM
 * email: qianlq0824@gmail.com
 */

public class Circle extends Shape {

    public Circle(ColorAPI colorAPI) {
        super(colorAPI);
    }

    @Override
    public void draw() {
        System.out.print("draw circle, ");
        colorAPI.drawColor();
    }
}
