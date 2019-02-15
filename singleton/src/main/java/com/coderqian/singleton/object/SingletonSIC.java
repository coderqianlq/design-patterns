package com.coderqian.singleton.object;

/**
 * 5、登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 */

/**
 * @author qianliqing
 * @date 2018/4/8 下午3:41
 * email: qianlq0824@gmail.com
 */

public class SingletonSIC {

    /**
     * 类级的内部类，也就是静态类的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，而且只有被调用时才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static final SingletonSIC INSTANCE = new SingletonSIC();
    }

    private SingletonSIC() {
    }

    public static final SingletonSIC getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("静态内部类单例");
    }
}
