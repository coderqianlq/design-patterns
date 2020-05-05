package com.qianlq.templatemethod.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-15 15:03
 */

public class ConcreteDoA extends AbstractTemplate {

    @Override
    void doSecond() {
        System.out.println("do A needs to do second.");
    }

    @Override
    void doThird() {
        System.out.println("do A needs to do third.");
    }
}
