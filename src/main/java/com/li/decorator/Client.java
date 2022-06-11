package com.li.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  12:01:47
 * @version:
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) throws IOException {
        FastFood friedRice = new FriedRice();

        System.out.println(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("__________________");

        friedRice = new Egg(friedRice);
        System.out.println(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("__________________");

        friedRice = new Egg(friedRice);
        System.out.println(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("__________________");

        friedRice = new Egg(friedRice);
        System.out.println(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");

        //创建BufferedWriter对象
        //创建FileWriter对象
        FileWriter fw = new FileWriter("C:\\Users\\Think\\Desktop\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //写数据
        bw.write("hello Buffered");

        bw.close();


    }
}
