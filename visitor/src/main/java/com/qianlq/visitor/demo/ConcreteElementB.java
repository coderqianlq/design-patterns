package com.qianlq.visitor.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "Do B.";
    }
}
