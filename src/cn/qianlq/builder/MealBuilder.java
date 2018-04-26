package cn.qianlq.builder;

import cn.qianlq.builder.object.*;

/**
 * @author qianliqing
 * @date 2018/4/11 下午2:21
 * email: qianlq0824@gmail.com
 */

public class MealBuilder {

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
}
