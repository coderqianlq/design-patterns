package com.qianlq.mediator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public abstract class Colleague {

    /**
     * 维持一个抽象中介者的引用
     */
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 声明自身方法，处理自己的行为
     */
    public abstract void handle();

    /**
     * 定义依赖方法，与中介者进行通信
     */
    public void notifyMediator() {
        mediator.common();
    }
}
