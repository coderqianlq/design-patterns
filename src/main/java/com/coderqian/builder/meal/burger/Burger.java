package com.coderqian.builder.meal.burger;

import com.coderqian.builder.meal.Item;
import com.coderqian.builder.meal.pack.Packing;
import com.coderqian.builder.meal.pack.Wrapper;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:46
 * email: qianlq0824@gmail.com
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
