package com.qianlq.state.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public abstract class State {

    /**
     * 声明抽象业务方法，不同的具体状态类可以不同的实现
     */
    public abstract void handle();
}
