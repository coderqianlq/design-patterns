package cn.qianlq.factorymethod.factory;

import cn.qianlq.factorymethod.object.Shape;

/**
 * @author qianliqing
 * @date 2018/11/22 1:58 PM
 * email: qianliqing@hyperchain.com
 */

public abstract class AbstractFactory {

    public abstract Shape getShape();

    public abstract Shape getShape(String args);

    public abstract Shape getShape(Object obj);
}
