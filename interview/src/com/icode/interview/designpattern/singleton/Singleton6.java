package com.icode.interview.designpattern.singleton;

/**
 * 懒汉式(线程安全版)
 * 同步代码块 双检锁 volatile关键字(避免指令重排) 效率高
 *
 * @author Unicorn
 */
public class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6(){
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
