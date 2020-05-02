package com.qianlq.interpreter.example;

/**
 * @author qianliqing
 * @version v1.0
 * @date 2019-09-14
 */

public class AndExpression extends NonterminalExpression {

    public AndExpression(AbstractExpression exp1, AbstractExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
