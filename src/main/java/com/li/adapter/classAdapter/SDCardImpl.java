package com.li.adapter.classAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:18:47
 * @version:
 * @Description: sd卡实现类
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSDCard() {
        String msg = "read SDCard";
        return msg;
    }

    @Override
    public void writeSDCard(String msg) {
        System.out.println("write SDCard--"+msg);
    }
}
