package com.coderqian.filter.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018-10-08 下午7:43
 * mail: qianlq0824@gmail.com
 */

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
