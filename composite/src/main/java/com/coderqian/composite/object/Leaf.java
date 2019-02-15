package com.coderqian.composite.object;

import java.util.List;

/**
 * @author qianliqing
 * @date 2018-12-14 10:00 PM
 * mail: qianlq0824@gmail.com
 */

public class Leaf extends Component {

    public Leaf(String str) {
        super(str);
    }

    @Override
    public void add(Component c) {
        System.out.println("叶子节点不支持add方法");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子节点不支持remove方法");
    }

    @Override
    public List<Component> getChild() {
        return null;
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void println() {
        super.print();
    }
}
