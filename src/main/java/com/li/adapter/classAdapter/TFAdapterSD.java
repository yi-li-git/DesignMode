package com.li.adapter.classAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:30:00
 * @version:
 * @Description: TF卡适配器
 */
public class TFAdapterSD extends TFCardImpl implements SDCard  {
    @Override
    public String readSDCard() {
        return readTFCard();
    }

    @Override
    public void writeSDCard(String msg) {
        writeTFCard(msg);
    }
}
