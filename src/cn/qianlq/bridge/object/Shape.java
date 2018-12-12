package cn.qianlq.bridge.object;

/**
 * @author qianliqing
 * @date 2018/12/11 5:24 PM
 * email: qianliqing@hyperchain.com
 */

public abstract class Shape {

    protected ColorAPI colorAPI;

    public Shape(ColorAPI colorAPI) {
        this.colorAPI = colorAPI;
    }

    public abstract void draw();
}
