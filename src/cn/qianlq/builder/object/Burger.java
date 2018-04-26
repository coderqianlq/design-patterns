package cn.qianlq.builder.object;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:46
 * email: qianlq0824@gmail.com
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
