package com.li.adapter.objectAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:21:26
 * @version:
 * @Description: tf 卡实现类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTFCard() {
        String msg = "read TFCard";
        return msg;
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.println("write TFCard---"+msg);

    }
}
