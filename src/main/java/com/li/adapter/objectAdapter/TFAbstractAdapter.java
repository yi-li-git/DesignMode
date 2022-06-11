package com.li.adapter.objectAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:50:49
 * @version:
 * @Description: 抽象适配器类
 */
public abstract class TFAbstractAdapter implements SDCard {
    @Override
    public String readSDCard() {
        return null;
    }

    @Override
    public void writeSDCard(String msg) {

    }
}
