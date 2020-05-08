package com.qianlq.visitor.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println(element.operation());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println(element.operation());
    }
}
