package com.li.adapter.objectAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:16:47
 * @version:
 * @Description: sd卡接口
 */
public interface SDCard {

    String readSDCard();

    void writeSDCard(String msg);
}
