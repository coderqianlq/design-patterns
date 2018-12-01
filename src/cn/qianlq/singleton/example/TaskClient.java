package cn.qianlq.singleton.example;

/**
 * @author qianliqing
 * @date 2018-11-27 1:13 PM
 * mail: qianlq0824@gmail.com
 */

public class TaskClient {

    public static void main(String[] args) {
        //不能直接通过new创建对象
        //TaskManager manager = new TaskManager();
        TaskManager manager = TaskManager.getInstance();
        manager.displayProcesses();
        manager.displayServices();
    }
}
