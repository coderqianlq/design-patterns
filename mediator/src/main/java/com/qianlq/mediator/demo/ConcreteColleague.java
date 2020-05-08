package com.qianlq.mediator.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void handle() {
        System.out.println("Do my own thing");
    }
}
