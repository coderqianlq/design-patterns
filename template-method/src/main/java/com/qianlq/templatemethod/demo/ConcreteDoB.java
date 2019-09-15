package com.qianlq.templatemethod.demo;

/**
 * @author qianliqing
 * @date 2019-09-15 15:07
 * @since v1.0
 */

public class ConcreteDoB extends AbstractTemplate {

    @Override
    void doSecond() {
        System.out.println("do B needs to do second.");
    }

    @Override
    void doThird() {
        System.out.println("do B needs to do third.");
    }

    @Override
    void doFouth() {
        System.out.println("maybe i can change when to finish!");
    }
}
