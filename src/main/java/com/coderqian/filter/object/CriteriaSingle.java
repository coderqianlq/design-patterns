package com.coderqian.filter.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018-10-08 下午7:46
 * mail: qianlq0824@gmail.com
 */

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
