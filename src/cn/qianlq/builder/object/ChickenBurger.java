package cn.qianlq.builder.object;

/**
 * @author qianliqing
 * @date 2018/4/11 下午1:48
 * email: qianlq0824@gmail.com
 */

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
