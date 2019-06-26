package com.qianlq.builder.meal.drink;

import com.qianlq.builder.meal.pack.Bottle;
import com.qianlq.builder.meal.Item;
import com.qianlq.builder.meal.pack.Packing;

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
