package com.qianlq.builder.meal.burger;

/**
 * @author CoderQian
 * @date 2018/4/11 下午1:48
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
