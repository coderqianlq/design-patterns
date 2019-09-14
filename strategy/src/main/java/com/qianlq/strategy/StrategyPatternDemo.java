package com.qianlq.strategy;

import com.qianlq.strategy.demo.AbstractStrategy;
import com.qianlq.strategy.demo.ConcreteStrategyA;
import com.qianlq.strategy.demo.Context;
import com.qianlq.util.XMLUtil;

/**
 * @author qianliqing
 * @version v1.0
 * @date 2019-09-14
 */

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context();
        //可在运行时指定类型
        AbstractStrategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.algorithm();

        strategy = (AbstractStrategy) XMLUtil.getObject("strategy/src/main/java/com/qianlq/strategy/config/config.xml", "className");
        context.setStrategy(strategy);
        context.algorithm();
    }
}
