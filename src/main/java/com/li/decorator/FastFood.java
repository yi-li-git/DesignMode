package com.li.decorator;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  11:40:02
 * @version:
 * @Description: 所有快餐抽象类 抽象构件（Component）角色
 */
public abstract class FastFood {
    private Integer price;
    private String desc;

    public FastFood() {
    }

    public FastFood(Integer price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract Integer cost();

    @Override
    public String toString() {
        return "FastFood{" + "price=" + price + ", desc='" + desc + '\'' + '}';
    }

}
