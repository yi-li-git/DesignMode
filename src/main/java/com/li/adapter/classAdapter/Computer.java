package com.li.adapter.classAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:23:21
 * @version:
 * @Description: 电脑类 操作SD卡
 */
public class Computer {

    public String readSDCard(SDCard sdCard) {
        return sdCard.readSDCard();
    }

    public void writeSDCard(String msg,SDCard sdCard) {
        sdCard.writeSDCard(msg);
    }
}
