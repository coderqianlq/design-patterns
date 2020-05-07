package com.qianlq.iterator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public interface Aggregate<E> {

    Iterator<E> createIterator();
}
