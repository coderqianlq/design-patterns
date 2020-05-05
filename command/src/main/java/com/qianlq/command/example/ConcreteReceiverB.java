package com.qianlq.command.example;

/**
 * @author CoderQian
 * @date 2019/7/12 3:35 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class ConcreteReceiverB extends AbstractReceiver {

    @Override
    public void act() {
        // 具体操作
        System.out.println("ReceiverB get the command.");
    }
}
