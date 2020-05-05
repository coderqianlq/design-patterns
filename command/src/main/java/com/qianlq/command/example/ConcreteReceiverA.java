package com.qianlq.command.example;

/**
 * @author CoderQian
 * @date 2019/7/12 3:38 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class ConcreteReceiverA extends AbstractReceiver {

    @Override
    public void act() {
        // 具体操作
        System.out.println("ReceiverA get the command.");
    }
}
