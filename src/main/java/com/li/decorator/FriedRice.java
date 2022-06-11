package com.li.decorator;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  11:43:29
 * @version:
 * @Description: 炒房 具体构件（Concrete  Component）角色
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }


    @Override
    public Integer cost() {
        return getPrice();
    }
}
