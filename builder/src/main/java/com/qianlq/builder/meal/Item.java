package com.qianlq.builder.meal;

import com.qianlq.builder.meal.pack.Packing;

/**
 * @author CoderQian
 * @date 2018/4/11 下午1:41
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public interface Item {
    String name();

    Packing packing();

    float price();
}
