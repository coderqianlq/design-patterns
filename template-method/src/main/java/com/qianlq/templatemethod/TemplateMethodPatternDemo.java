package com.qianlq.templatemethod;

import com.qianlq.templatemethod.demo.AbstractTemplate;
import com.qianlq.templatemethod.demo.ConcreteDoB;

/**
 * @author qianliqing
 * @date 2019-09-14 18:48
 * @since v1.0
 */

public class TemplateMethodPatternDemo {

    public static void main(String[] args) {
        AbstractTemplate doB = new ConcreteDoB();
        doB.templateMethod();
    }
}
