package com.qianlq.iterator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public interface Iterator<E> {

    /**
     * 返回下一个元素
     *
     * @return 下一个元素
     */
    E next();

    /**
     * 判断是否存在下一个元素
     *
     * @return true or false
     */
    boolean hasNext();

}
