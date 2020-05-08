package com.qianlq.mediator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/8
 */

public abstract class Mediator {

    /**
     * 用于存储同事对象
     */
    protected List<Colleague> colleagues = new ArrayList<>();

    /**
     * 注册方法，用于增加同事对象
     */
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    /**
     * 声明抽象的业务方法
     */
    public abstract void common();

}
