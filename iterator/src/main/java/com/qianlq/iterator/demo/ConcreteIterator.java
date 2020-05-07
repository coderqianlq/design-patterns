package com.qianlq.iterator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public class ConcreteIterator<E> implements Iterator<E> {

    /**
     * 定义游标，初始值-1
     */
    private int cursor = -1;

    /**
     * 维持一个对具体聚合对象的引用
     */
    private ConcreteAggregate<E> aggregate;

    public ConcreteIterator(ConcreteAggregate<E> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public E next() {
        return aggregate.list.get(++cursor);
    }

    @Override
    public boolean hasNext() {
        return cursor + 1 < aggregate.list.size();
    }
}
