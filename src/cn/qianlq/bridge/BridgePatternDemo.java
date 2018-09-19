package cn.qianlq.bridge;

import cn.qianlq.bridge.object.Circle;
import cn.qianlq.bridge.object.GreenCircle;
import cn.qianlq.bridge.object.RedCircle;
import cn.qianlq.bridge.object.Shape;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:34
 * mail: 1242202279@qq.com
 */

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
