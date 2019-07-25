package com.qianlq.command.example;

import java.util.ArrayList;

/**
 * @author qianliqing
 * @date 2019/7/12 3:39 PM
 * email: qianliqing@hyperchain.com
 */

public class ReceiverQueue {

    private ArrayList<AbstractReceiver> receivers = new ArrayList<>();

    public ArrayList<AbstractReceiver> getReceivers() {
        return receivers;
    }

    public void addReceiver(AbstractReceiver receiver) {
        receivers.add(receiver);
    }

    public void removeReceiver(AbstractReceiver receiver) {
        receivers.remove(receiver);
    }
}
