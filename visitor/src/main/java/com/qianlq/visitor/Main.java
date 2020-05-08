package com.qianlq.visitor;

import com.qianlq.visitor.demo.*;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class Main {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);

        System.out.println();
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
