package com.qianlq.interpreter.example;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-14
 */

public class TerminalExpression extends AbstractExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
