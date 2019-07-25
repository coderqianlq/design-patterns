package com.qianlq.command.example;

/**
 * @author qianliqing
 * @date 2019/7/12 3:38 PM
 * email: qianliqing@hyperchain.com
 */

public class ConcreteReceiverA extends AbstractReceiver {

    @Override
    public void act() {
        // 具体操作
        System.out.println("ReceiverA get the command.");
    }
}
