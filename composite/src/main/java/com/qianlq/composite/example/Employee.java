package com.qianlq.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018/11/16 3:47 PM
 * email: qianlq0824@gmail.com
 */

public class Employee {

    private String name;

    private String dept;

    private int salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
