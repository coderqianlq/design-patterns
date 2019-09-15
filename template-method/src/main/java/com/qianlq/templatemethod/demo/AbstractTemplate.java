package com.qianlq.templatemethod.demo;

/**
 * @author qianliqing
 * @date 2019-09-15 14:22
 * @since v1.0
 */

public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public final void templateMethod() {
        doFirst();
        doSecond();
        doThird();
        doFouth();
    }

    /**
     * 具体方法
     */
    void doFirst() {
        System.out.println("start do something.");
    }

    /**
     * 抽象方法，延迟到子类
     */
    abstract void doSecond();

    /**
     * 抽象方法，延迟到子类
     */
    abstract void doThird();

    /**
     * 具体方法
     */
    void doFouth() {
        System.out.println("finish!");
    }
}
