package com.qianlq.filter.object;

import java.util.List;

/**
 * @author qianliqing
 * @date 2018-10-08 下午7:35
 * mail: qianlq0824@gmail.com
 */

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
