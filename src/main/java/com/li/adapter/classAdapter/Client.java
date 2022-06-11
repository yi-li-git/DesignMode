package com.li.adapter.classAdapter;

/**
 * @Author: pijione
 * @createTime: 2022/06/10  21:27:43
 * @version:
 * @Description: 客户端 操作计算机读取sd卡
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        String s = computer.readSDCard(new SDCardImpl());
        System.out.println(s);

        computer.writeSDCard("sss",new SDCardImpl());

        String s1 = computer.readSDCard(new TFAdapterSD());
        System.out.println(s1);
    }
}
