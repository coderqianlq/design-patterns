package com.coderqian.builder.meal.drink;

import com.coderqian.builder.meal.pack.Bottle;
import com.coderqian.builder.meal.Item;
import com.coderqian.builder.meal.pack.Packing;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:47
 * email: qianlq0824@gmail.com
 */

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
