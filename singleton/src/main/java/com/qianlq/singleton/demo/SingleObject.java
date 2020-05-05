package com.qianlq.singleton.demo;

/**
 * @author CoderQian
 * @date 2018/4/8 下午2:44
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject ourInstance = new SingleObject();

    /**
     * 获取唯一可用的对象
     *
     * @return SingleObject
     */
    public static SingleObject getInstance() {
        return ourInstance;
    }

    /**
     * 构造函数私有化，这样该类就不会被实例化
     */
    private SingleObject() {
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
