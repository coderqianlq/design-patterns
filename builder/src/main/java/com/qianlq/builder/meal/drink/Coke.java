package com.qianlq.builder.meal.drink;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:50
 * email: qianlq0824@gmail.com
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
