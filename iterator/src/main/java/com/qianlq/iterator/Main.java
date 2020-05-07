package com.qianlq.iterator;

import com.qianlq.iterator.demo.ConcreteAggregate;
import com.qianlq.iterator.demo.ConcreteIterator;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("钱");
        aggregate.add("立");
        aggregate.add("清");
        ConcreteIterator<String> iterator = new ConcreteIterator<>(aggregate);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
