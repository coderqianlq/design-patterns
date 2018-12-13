package cn.qianlq.bridge.object;

/**
 * @author qianliqing
 * @date 2018/12/11 5:28 PM
 * email: qianliqing@hyperchain.com
 */

public class Green implements ColorAPI {

    @Override
    public void drawColor() {
        System.out.println("tint green.");
    }
}
