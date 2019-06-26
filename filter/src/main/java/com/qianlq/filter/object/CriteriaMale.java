package com.qianlq.filter.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018-10-08 下午7:40
 * mail: qianlq0824@gmail.com
 */

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
