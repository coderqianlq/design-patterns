package com.qianlq.builder.meal.burger;

import com.qianlq.builder.meal.Item;
import com.qianlq.builder.meal.pack.Packing;
import com.qianlq.builder.meal.pack.Wrapper;

/**
 * @author CoderQian
 * @date 2018/4/11 下午1:46
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
