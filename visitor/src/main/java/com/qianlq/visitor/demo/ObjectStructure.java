package com.qianlq.visitor.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author qianliqing
 * @version v1.0
 * @date 2020/5/8
 */

public class ObjectStructure {
    /**
     * 存放元素对象
     */
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
