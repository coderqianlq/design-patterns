package cn.qianlq.builder.object;

/**
 * @author qianliqing
 * @date 2018/4/11 下午2:00
 * email: qianlq0824@gmail.com
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
