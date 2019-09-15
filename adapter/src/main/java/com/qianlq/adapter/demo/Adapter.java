package com.qianlq.adapter.demo;

/**
 * 对象适配器模式
 *
 * @author qianliqing
 * @date 2018/12/10 8:24 PM
 * email: qianlq0824@gmail.com
 */

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void play() {
        adaptee.playMusic();
    }
}
