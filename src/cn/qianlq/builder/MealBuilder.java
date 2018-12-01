package cn.qianlq.builder;

import cn.qianlq.builder.meal.Meal;
import cn.qianlq.builder.meal.burger.ChickenBurger;
import cn.qianlq.builder.meal.burger.VegBurger;
import cn.qianlq.builder.meal.drink.Coke;
import cn.qianlq.builder.meal.drink.Pepsi;

/**
 * @author qianliqing
 * @date 2018/4/11 下午2:21
 * email: qianlq0824@gmail.com
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
