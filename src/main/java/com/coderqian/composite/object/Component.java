package com.coderqian.composite.object;

import java.util.List;

/**
 * @author qianliqing
 * @date 2018-12-14 9:59 PM
 * mail: qianlq0824@gmail.com
 */

public abstract class Component {

    private String str;

    public Component(String str) {
        this.str = str;
    }

    /**
     * 添加子节点
     *
     * @param c 添加的节点
     */
    public abstract void add(Component c);

    /**
     * 删除子元素
     *
     * @param c 删除的节点
     */
    public abstract void remove(Component c);

    /**
     * 获取所有子节点
     *
     * @return List<Component>
     */
    public abstract List<Component> getChild();

    /**
     * 获取指定下标的节点
     *
     * @param i 下标
     * @return Component
     */
    public abstract Component getChild(int i);

    /**
     * 打印属性
     */
    public abstract void println();

    public void print() {
        System.out.println(this.str);
    }
}

