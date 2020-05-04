package com.qianlq.composite.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoderQian
 * @date 2018-12-14 10:01 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public Composite(String str) {
        super(str);
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public List<Component> getChild() {
        return list;
    }

    @Override
    public void println() {
        for (Component c : list) {
            c.println();
        }
    }
}
