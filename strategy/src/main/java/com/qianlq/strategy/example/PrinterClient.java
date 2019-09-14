package com.qianlq.strategy.example;

import com.qianlq.strategy.example.printer.AbstractPrinter;
import com.qianlq.util.XMLUtil;

import java.util.List;
import java.util.Scanner;

/**
 * @author qianliqing
 * @date 2019-09-14 14:59
 * @since v1.0
 */

public class PrinterClient {

    private static final String DISCOUNT = "1";

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("com.qianlq.strategy.example.printer.HpPrinter");
        AbstractPrinter o = (AbstractPrinter) clazz.newInstance();

        String isInStrategy = XMLUtil.getBean("strategy/src/main/java/com/qianlq/strategy/config/printer.xml", "inStrategy");
        List<String> list = XMLUtil.getBeanList("strategy/src/main/java/com/qianlq/strategy/config/printer.xml", "className");

        if (list == null || list.size() < 1) {
            return;
        }

        //模拟客户端的输入
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        AbstractPrinter printer = (AbstractPrinter) Class.forName(list.get(index)).newInstance();
        printer.setQuantity(quantity);
        if (DISCOUNT.equals(isInStrategy)) {
            printer.strategy();
        }
        System.out.println("品牌为：" + printer.getBrand());
        System.out.println("单价为：" + printer.getPrice());
        System.out.println("数量为：" + printer.getQuantity());
        System.out.println("总价为：" + printer.getTotalPrice());
    }
}

