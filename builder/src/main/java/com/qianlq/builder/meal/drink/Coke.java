package com.qianlq.builder.meal.drink;

/**
 * @author CoderQian
 * @date 2018/4/11 下午1:50
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
