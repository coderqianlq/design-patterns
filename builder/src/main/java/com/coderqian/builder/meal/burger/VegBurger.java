package com.coderqian.builder.meal.burger;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:48
 * email: qianlq0824@gmail.com
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
