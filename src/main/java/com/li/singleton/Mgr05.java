package com.li.singleton;

import java.util.Map;

public enum Mgr05 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.INSTANCE.hashCode());
            }).start();
        }
    }
}
