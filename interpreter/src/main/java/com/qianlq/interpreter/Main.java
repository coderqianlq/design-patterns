package com.qianlq.interpreter;

import com.qianlq.interpreter.example.AbstractExpression;
import com.qianlq.interpreter.example.AndExpression;
import com.qianlq.interpreter.example.OrExpression;
import com.qianlq.interpreter.example.TerminalExpression;

/**
 * @author CoderQian
 * @date 2019-09-14
 */

public class Main {

    public static AbstractExpression getMaleExpression() {
        AbstractExpression robert = new TerminalExpression("Robert");
        AbstractExpression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }


    public static AbstractExpression getMarriedWomanExpression() {
        AbstractExpression julie = new TerminalExpression("Julie");
        AbstractExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        AbstractExpression isMale = getMaleExpression();
        AbstractExpression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
