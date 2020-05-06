package com.qianlq.state;

import com.qianlq.state.demo.ConcreteStateA;
import com.qianlq.state.demo.ConcreteStateB;
import com.qianlq.state.demo.Context;
import com.qianlq.state.demo.State;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        State state = new ConcreteStateA();
        context.setState(state);
        state.handle();

        state = new ConcreteStateB();
        context.setState(state);
        state.handle();
    }
}
