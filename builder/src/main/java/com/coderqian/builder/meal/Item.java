package com.coderqian.builder.meal;

import com.coderqian.builder.meal.pack.Packing;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:41
 * email: qianlq0824@gmail.com
 */

public interface Item {
    String name();

    Packing packing();

    float price();
}
