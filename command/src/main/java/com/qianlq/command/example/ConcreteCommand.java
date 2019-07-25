package com.qianlq.command.example;

import java.util.ArrayList;

/**
 * @author qianliqing
 * @date 2019/7/12 3:17 PM
 * email: qianliqing@hyperchain.com
 */

public class ConcreteCommand extends AbstractCommand {

    // 维持一个对请求接收者对象的引用
    private AbstractReceiver receiver;

    // 维持一个对请求接收者对象队列的引用
    private ReceiverQueue receiverQueue;

    public void setReceiver(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    public void setReceiverQueue(ReceiverQueue receiverQueue) {
        this.receiverQueue = receiverQueue;
    }

    @Override
    public void execute() {
        receiver.act();
    }

    @Override
    public void queueExecute() {
        ArrayList<AbstractReceiver> receivers = receiverQueue.getReceivers();
        for (AbstractReceiver receiver : receivers) {
            receiver.act();
        }
    }
}
