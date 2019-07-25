package com.qianlq.command.example;

/**
 * @author qianliqing
 * @date 2019/7/12 3:14 PM
 * email: qianliqing@hyperchain.com
 */

public abstract class AbstractCommand {

    public abstract void execute();

    public abstract void queueExecute();
}
