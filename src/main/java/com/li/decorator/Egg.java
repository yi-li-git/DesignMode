package com.li.decorator;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  11:55:54
 * @version:
 * @Description: 鸡蛋 具体装饰（ConcreteDecorator）角色
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
       super(1,"鸡蛋",fastFood);
    }

    @Override
    public Integer cost() {
        return getPrice() + getFastFood().getPrice() ;
    }

    @Override
    public String getDesc() {
        return  super.getDesc()+getFastFood().getDesc();
    }


}
