package com.li.strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] a = {new Dog(23,"sad",150),new Dog(2,"阿迪斯",180)};

        Sorter<Dog> sorter = new Sorter<Dog>();
        sorter.sort(a,(dog1,dog2)-> dog1.height<dog2.height? 1:-1);
        System.out.println(Arrays.toString(a));
    }
}
