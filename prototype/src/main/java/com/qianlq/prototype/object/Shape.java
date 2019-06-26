package com.qianlq.prototype.object;

import java.io.Serializable;

/**
 * @author qianliqing
 * @date 2018/4/8 下午2:25
 * email: qianlq0824@gmail.com
 */

public abstract class Shape implements Cloneable, Serializable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
