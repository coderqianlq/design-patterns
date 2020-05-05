package com.qianlq.templatemethod;

import com.qianlq.templatemethod.demo.AbstractTemplate;
import com.qianlq.templatemethod.demo.ConcreteDoB;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2019-09-14 18:48
 */

public class Main {

    public static void main(String[] args) {
        AbstractTemplate doB = new ConcreteDoB();
        doB.templateMethod();
    }
}
