package com.coderqian.composite;

import com.coderqian.composite.object.Component;
import com.coderqian.composite.object.Composite;
import com.coderqian.composite.example.Employee;
import com.coderqian.composite.object.Leaf;

import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author qianliqing
 * @date 2018/11/16 3:49 PM
 * email: qianlq0824@gmail.com
 */

public class CompositePatternDemo {

    public static void main(String[] args) {
        Component root, componentA, componentB, leafA1, leafA2, leafA3, leafB1, leafB2, leafOfRoot;

        root = new Composite("root");

        leafOfRoot = new Leaf("leafOfRoot");
        componentA = new Composite("componentA");
        componentB = new Composite("componentB");
        root.add(componentA);
        root.add(componentB);
        root.add(leafOfRoot);

        leafA1 = new Leaf("leafA1");
        leafA2 = new Leaf("leafA2");
        leafA3 = new Leaf("leafA3");
        componentA.add(leafA1);
        componentA.add(leafA2);
        componentA.add(leafA3);

        leafB1 = new Leaf("leafB1");
        leafB2 = new Leaf("leafB2");
        componentB.add(leafB1);
        componentB.add(leafB2);

        componentA.getChild(1);
        componentA.remove(leafA3);

        leafB2.add(leafA1);

        System.out.println();
        root.print();
        for (Component first : root.getChild()) {
            first.print();
            List<Component> child = first.getChild();
            if (child == null) {
                continue;
            }
            for (Component second : child) {
                second.print();
            }
        }

        System.out.println();
        root.println();
        System.out.println();

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

        System.out.println("#### 广度遍历 ####");

        //打印该组织的所有员工
        Queue<Employee> queue = new LinkedBlockingQueue<>();
        queue.add(CEO);
        while (!queue.isEmpty()) {
            Employee employee = queue.poll();
            System.out.println(employee);
            queue.addAll(employee.getSubordinates());
        }

        System.out.println("#### 深度遍历 ####");

        //打印该组织的所有员工
        Stack<Employee> stack = new Stack<>();
        stack.add(CEO);
        while (!stack.isEmpty()) {
            Employee employee = stack.pop();
            System.out.println(employee);
            stack.addAll(employee.getSubordinates());
        }
    }
}
