package cn.qianlq.singleton.reflection;

import cn.qianlq.singleton.object.SingletonEhs;
import cn.qianlq.singleton.object.SingletonEnum;

import java.lang.reflect.Constructor;

/**
 * @author qianliqing
 * @date 2018-11-27 10:09 AM
 * mail: qianlq0824@gmail.com
 */

public class SingleReflection {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        SingletonEhs s1 = SingletonEhs.getInstance();

        Class clazz = SingletonEhs.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        SingletonEhs s2 = (SingletonEhs) constructor.newInstance();
        SingletonEhs s3 = (SingletonEhs) constructor.newInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        SingletonEnum s4 = SingletonEnum.INSTANCE;

        clazz = SingletonEnum.class;
        constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        SingletonEnum s5 = (SingletonEnum) constructor.newInstance();
        SingletonEnum s6 = (SingletonEnum) constructor.newInstance();

        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
