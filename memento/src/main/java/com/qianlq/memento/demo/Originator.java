package com.qianlq.memento.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
