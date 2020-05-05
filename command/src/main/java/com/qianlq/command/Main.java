package com.qianlq.command;

import com.qianlq.command.example.*;

/**
 * @author CoderQian
 * @date 2019/7/12 3:14 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("测试单请求单接收者的情况：");
        ConcreteCommand command = new ConcreteCommand();
        command.setReceiver(new ConcreteReceiverA());
        Invoker invoker = new Invoker(command);
        invoker.call();

        System.out.println("测试单请求多接收者的情况：");
        ReceiverQueue receiverQueue = new ReceiverQueue();
        receiverQueue.addReceiver(new ConcreteReceiverA());
        receiverQueue.addReceiver(new ConcreteReceiverB());
        command.setReceiverQueue(receiverQueue);
        invoker = new Invoker(command);
        invoker.callAll();

        System.out.println("测试多请求单接收者的情况：");
        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(command);
        commandQueue.addCommand(command);
        invoker.setCommandQueue(commandQueue);
        invoker.queueCall();
    }
}
