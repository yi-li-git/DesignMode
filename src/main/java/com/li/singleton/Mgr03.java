package com.li.singleton;

public class Mgr03 {
    private static volatile Mgr03 INSTANCE=null;//指令重排问题

    private Mgr03(){}

    public  static  Mgr03 getInstance() {

        if (INSTANCE==null){
            synchronized(Mgr03.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(1);
                        INSTANCE = new Mgr03();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                ()->{
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            ).start();
        }
    }
}
