package cn.qianlq.singleton;

import cn.qianlq.singleton.object.*;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:46
 * email: qianlq0824@gmail.com
 */

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();
        object.showMessage();

        SingletonLhsNoSyn singleton1 = SingletonLhsNoSyn.getInstance();
        singleton1.showMessage();

        SingletonLhsSyn singleton2 = SingletonLhsSyn.getInstance();
        singleton2.showMessage();

        SingletonEhs singleton3 = SingletonEhs.getInstance();
        singleton3.showMessage();

        SingletonDCL singleton4 = SingletonDCL.getInstance();
        singleton4.showMessage();

        SingletonSIC singleton5 = SingletonSIC.getInstance();
        singleton5.showMessage();

        SingletonEnum singleton6 = SingletonEnum.INSTANCE;
        singleton6.showMessage();
    }
}
