package cn.qianlq.factorymethod.factory;

import cn.qianlq.factorymethod.object.Shape;
import cn.qianlq.factorymethod.object.Square;

/**
 * @author qianliqing
 * @date 2018/11/22 2:04 PM
 * email: qianliqing@hyperchain.com
 */

public class SquareFactory extends AbstractFactory {

    /**
     * 返回具体的 Square 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Square();
    }
}
