package com.qianlq.strategy.example.printer;

/**
 * @author qianliqing
 * @date 2019-09-14 14:52
 * @since v1.0
 */

public class CanonPrinter extends AbstractPrinter {

    public CanonPrinter() {
        this.brand = "佳能打印机";
        this.price = 1000.00;
    }

    @Override
    public void strategy() {
        Integer quantity = getQuantity();
        if (quantity > 10 && quantity <= 100) {
            this.price = this.price * 0.8;
        } else if (quantity > 100) {
            this.price = this.price * 0.6;
        } else {
        }
    }
}
