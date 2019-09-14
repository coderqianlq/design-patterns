package com.qianlq.strategy.example.printer;

/**
 * @author qianliqing
 * @date 2019-09-14 14:56
 * @since v1.0
 */

public class HpPrinter extends AbstractPrinter {

    public HpPrinter() {
        this.brand = "惠普打印机";
        this.price = 1250.00;
    }

    @Override
    public void strategy() {
        if (getQuantity() > 50) {
            this.price = this.price * 0.7;
        }
    }
}
