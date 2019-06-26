package com.qianlq.builder;

/**
 * @author qianliqing
 * @date 2018-12-01 9:47 PM
 * mail: qianlq0824@gmail.com
 */

public class MealDirector {

    public void setBuilder(AbstractBuilder builder) {
        builder.prepareBurger();
        builder.prepareDrink();
    }
}
