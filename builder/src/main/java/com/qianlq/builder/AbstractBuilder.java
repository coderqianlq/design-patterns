package com.qianlq.builder;

import com.qianlq.builder.meal.Meal;

/**
 * @author CoderQian
 * @date 2018-12-01 9:34 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public abstract class AbstractBuilder {

    public static Meal noDirectorMeal = new Meal();

    public abstract void prepareBurger();

    public abstract void prepareDrink();

    public abstract Meal prepareMeal();

    public abstract void noDirectorPrepareBurger();

    public abstract void noDirectorPrepareDrink();

    public static void prepareMeal(AbstractBuilder builder) {
        builder.noDirectorPrepareBurger();
        builder.noDirectorPrepareDrink();
    }
}
