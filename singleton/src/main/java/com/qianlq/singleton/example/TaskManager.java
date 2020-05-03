package com.qianlq.singleton.example;

/**
 * @author CoderQian
 * @date 2018-11-27 9:15 AM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class TaskManager {

    /**
     * 初始化窗口
     */
    private TaskManager() {
        //
    }

    /**
     * 显示进程
     */
    public void displayProcesses() {
        //
    }

    /**
     * 显示服务
     */
    public void displayServices() {
        //
    }

    //其他方法
    //……

    private static TaskManager tm = null;

    public static TaskManager getInstance() {
        if (tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }
}
