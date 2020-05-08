package com.qianlq.visitor.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public interface Element {
    void accept(Visitor visitor);
}
