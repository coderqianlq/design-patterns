package cn.qianlq.factorymethod.factory;

import cn.qianlq.factorymethod.object.Rectangle;
import cn.qianlq.factorymethod.object.Shape;

/**
 * @author qianliqing
 * @date 2018/11/22 2:03 PM
 * email: qianliqing@hyperchain.com
 */

public class RectangleFactory extends AbstractFactory {

    /**
     * 返回具体的 Rectangle 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
