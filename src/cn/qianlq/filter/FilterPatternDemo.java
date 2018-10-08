package cn.qianlq.filter;

import cn.qianlq.filter.object.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 *
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 *
 * @author qianliqing
 * @date 2018-10-08 下午7:23
 * mail: qianlq0824@gmail.com
 */

public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        male.meetCriteria(persons).forEach((System.out::println));

        System.out.println("\nFemales: ");
        female.meetCriteria(persons).forEach((System.out::println));

        System.out.println("\nSingle: ");
        single.meetCriteria(persons).forEach((System.out::println));

        System.out.println("\nSingle Males: ");
        singleMale.meetCriteria(persons).forEach((System.out::println));

        System.out.println("\nSingle Or Females: ");
        singleOrFemale.meetCriteria(persons).forEach((System.out::println));
    }
}
