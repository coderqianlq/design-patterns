package com.qianlq.interpreter.example;

/**
 * @author qianliqing
 * @version v1.0
 * @date 2019-09-14
 */

public abstract class AbstractExpression {

    /**
     * 获取解释后的表达式
     *
     * @param context 环境类
     * @return 表达式
     */
    public abstract boolean interpret(String context);
}
