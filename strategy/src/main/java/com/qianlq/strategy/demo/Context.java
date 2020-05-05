package com.qianlq.strategy.demo;

/**
 * @author CoderQian
 * @date 2019-09-14
 * @since v1.0
 */

public class Context {

    /**
     * 维持一个对抽象策略类的引用
     */
    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略类中的算法
     */
    public void algorithm() {
        strategy.algorithm();
    }
}
