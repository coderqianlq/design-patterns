package com.qianlq.command.example;

/**
 * @author qianliqing
 * @date 2019/7/12 3:15 PM
 * email: qianliqing@hyperchain.com
 */

public class Invoker {

    private AbstractCommand command;

    private CommandQueue commandQueue;

    /**
     * 构造注入
     *
     * @param command 抽象命令类
     */
    public Invoker(AbstractCommand command) {
        this.command = command;
    }

    /**
     * 构造注入
     *
     * @param commandQueue 抽象命令队列类
     */
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    /**
     * 设值注入
     *
     * @param command 抽象命令类
     */
    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    /**
     * 构造注入
     *
     * @param commandQueue 抽象命令队列类
     */
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        command.execute();
    }

    public void callAll() {
        command.queueExecute();
    }

    public void queueCall() {
        commandQueue.execute();
    }
}
