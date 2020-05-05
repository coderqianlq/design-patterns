package com.qianlq.builder.meal.burger;

/**
 * @author CoderQian
 * @date 2018/4/11 下午1:48
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
