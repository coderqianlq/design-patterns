package com.qianlq.mediator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class ConcreteMediator extends Mediator {

    @Override
    public void common() {
        assert colleagues.size() > 0;
        // 通过中介者调用同事对象
        colleagues.get(0).handle();
    }
}
