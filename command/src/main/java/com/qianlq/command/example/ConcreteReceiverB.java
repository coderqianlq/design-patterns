package com.qianlq.command.example;

/**
 * @author qianliqing
 * @date 2019/7/12 3:35 PM
 * email: qianliqing@hyperchain.com
 */

public class ConcreteReceiverB extends AbstractReceiver {

    @Override
    public void act() {
        // 具体操作
        System.out.println("ReceiverB get the command.");
    }
}
