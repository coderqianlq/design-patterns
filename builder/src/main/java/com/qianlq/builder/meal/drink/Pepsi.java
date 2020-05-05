package com.qianlq.builder.meal.drink;

/**
 * @author CoderQian
 * @date 2018/4/11 下午2:00
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
