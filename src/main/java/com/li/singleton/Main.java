package com.li.singleton;

public class Main {

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getINSTANCE();
        Mgr01 m2 = Mgr01.getINSTANCE();
        System.out.println(m2==m1);
    }
}
