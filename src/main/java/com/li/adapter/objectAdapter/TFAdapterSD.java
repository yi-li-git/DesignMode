package com.li.adapter.objectAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:30:00
 * @version:
 * @Description: TF卡适配器
 */
public class TFAdapterSD extends TFAbstractAdapter {


    private TFCard tfCard;

    public TFAdapterSD(TFCard tfCard){
        this.tfCard=tfCard;
    }

    @Override
    public String readSDCard() {
        return tfCard.readTFCard();
    }
}
