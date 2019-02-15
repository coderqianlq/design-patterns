package com.coderqian.singleton.object;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:44
 * email: qianlq0824@gmail.com
 */

public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject ourInstance = new SingleObject();

    /**
     * 构造函数私有化，这样该类就不会被实例化
     *
     * @return
     */
    public static SingleObject getInstance() {
        return ourInstance;
    }

    /**
     * 获取唯一可用的对象
     */
    private SingleObject() {
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
