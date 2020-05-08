package com.qianlq.visitor.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
