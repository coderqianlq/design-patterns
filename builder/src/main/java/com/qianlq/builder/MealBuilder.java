package com.qianlq.builder;

import com.qianlq.builder.meal.Meal;
import com.qianlq.builder.meal.burger.ChickenBurger;
import com.qianlq.builder.meal.burger.VegBurger;
import com.qianlq.builder.meal.drink.Coke;
import com.qianlq.builder.meal.drink.Pepsi;

/**
 * @author CoderQian
 * @date 2018/4/11 下午2:21
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class MealBuilder extends AbstractBuilder {

    private Meal meal = new Meal();

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    @Override
    public void prepareBurger() {
        meal.addItem(new VegBurger());
    }

    @Override
    public void prepareDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public Meal prepareMeal() {
        return meal;
    }

    @Override
    public void noDirectorPrepareBurger() {
        noDirectorMeal.addItem(new VegBurger());
    }

    @Override
    public void noDirectorPrepareDrink() {
        noDirectorMeal.addItem(new Coke());
    }
}
