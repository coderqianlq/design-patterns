package cn.qianlq.builder;

import cn.qianlq.builder.meal.Meal;

/**
 * @author qianliqing
 * @date 2018/4/11 下午2:21
 * email: qianlq0824@gmail.com
 */

public class BuilderPatternDemo {

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
