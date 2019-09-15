package com.qianlq.strategy.demo;

/**
 * @author qianliqing
 * @date 2019-09-14
 * @since v1.0
 */

public class ConcreteStrategyA extends AbstractStrategy {

    @Override
    public void algorithm() {
        System.out.println("ConcreteStrategyA");
    }
}