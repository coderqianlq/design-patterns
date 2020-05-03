package com.qianlq.builder;

import com.qianlq.builder.meal.Meal;

/**
 * @author CoderQian
 * @date 2018/4/11 下午2:21
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

    public static void main(String[] args) {
        MealDirector director = new MealDirector();
        MealBuilder builder = new MealBuilder();

        director.setBuilder(builder);
        Meal meal = builder.prepareMeal();
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());

        AbstractBuilder.prepareMeal(builder);
        Meal noDirectorMeal = AbstractBuilder.noDirectorMeal;
        System.out.println("\n");
        noDirectorMeal.showItems();
        System.out.println("Total Cost: " + noDirectorMeal.getCost());

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("\n\nVeg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
