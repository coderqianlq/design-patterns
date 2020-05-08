package com.qianlq.mediator;

import com.qianlq.mediator.demo.Colleague;
import com.qianlq.mediator.demo.ConcreteColleague;
import com.qianlq.mediator.demo.ConcreteMediator;
import com.qianlq.mediator.demo.Mediator;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/7
 */

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague = new ConcreteColleague(mediator);
        mediator.register(colleague);
        mediator.common();
    }
}
