package com.qianlq.memento.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class Caretaker {

    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
