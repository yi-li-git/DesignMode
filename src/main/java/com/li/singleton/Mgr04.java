package com.li.singleton;

public class Mgr04 {
    private Mgr04(){}

    private static class Mgr04Holder{
        private static final Mgr04 INSTANCE= new Mgr04();
    }
    public static Mgr04 getInstance(){
        return Mgr04Holder.INSTANCE;
    }

}
