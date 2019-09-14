package com.qianlq.strategy.demo;

/**
 * @author qianliqing
 * @since v2.0
 * @date 2019-09-14
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
