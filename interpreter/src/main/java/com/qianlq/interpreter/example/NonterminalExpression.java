package com.qianlq.interpreter.example;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-14
 */

public abstract class NonterminalExpression extends AbstractExpression {

    protected AbstractExpression exp1;
    protected AbstractExpression exp2;

    public NonterminalExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
