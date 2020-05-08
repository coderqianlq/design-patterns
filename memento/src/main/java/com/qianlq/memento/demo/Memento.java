package com.qianlq.memento.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
