package com.qianlq.state.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public class Context {

    /**
     * 维持一个对抽象状态对象的引用
     */
    private State state;

    /**
     * 其他属性值，该属性值的变化可能会导致对象状态发生变化
     */
    private int value;

    public void setState(State state) {
        // 设置状态对象
        this.state = state;
    }

    public void setValue(int value) {
        // 修改属性值
        this.value = value;
    }

    public void changeState() {
        if (value == 0) {
            this.setState(new ConcreteStateA());
        } else {
            this.setState(new ConcreteStateB());
        }
    }

    public void request() {
        // 调用状态对象的业务方法
        state.handle();
    }
}

