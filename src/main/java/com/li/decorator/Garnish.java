package com.li.decorator;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  11:52:50
 * @version:
 * @Description: 配料  装饰者抽象类
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(Integer price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
