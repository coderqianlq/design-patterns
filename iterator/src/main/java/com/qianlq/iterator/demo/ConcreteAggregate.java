package com.qianlq.iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public class ConcreteAggregate<E> implements Aggregate<E> {

    List<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
