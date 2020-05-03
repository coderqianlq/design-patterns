package com.qianlq.builder;

/**
 * @author CoderQian
 * @date 2018-12-01 9:47 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class MealDirector {

    public void setBuilder(AbstractBuilder builder) {
        builder.prepareBurger();
        builder.prepareDrink();
    }
}
