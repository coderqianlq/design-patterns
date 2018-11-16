package cn.qianlq.composite;

import cn.qianlq.composite.object.Employee;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author qianliqing
 * @date 2018/11/16 3:49 PM
 * email: qianliqing@hyperchain.com
 */

public class CompositePatternDemo {

    public static void main(String[] args) {
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
