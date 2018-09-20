package cn.qianlq.bridge.object;

/**
 * @author qianliqing
 * @date 2018-09-19 下午2:37
 * mail: 1242202279@qq.com
 */

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}