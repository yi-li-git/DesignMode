package com.li.singleton;

/**
 * 饿汉
 */
public class Mgr01 {
    private Mgr01 (){}

    private static final Mgr01 INSTANCE= new Mgr01();

    public static Mgr01 getINSTANCE() {
        return INSTANCE;
    }

    public void fun(){
        System.out.println("fun.....");
    }
}
