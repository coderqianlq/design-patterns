package com.qianlq.strategy.example.printer;

/**
 * @author qianliqing
 * @date 2019-09-14 14:49
 * @since v1.0
 */

public abstract class AbstractPrinter {

    String brand;

    Double price;

    private Integer quantity;

    /**
     * 声明抽象策略方法
     */
    public abstract void strategy();

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return this.price * this.quantity;
    }
}
