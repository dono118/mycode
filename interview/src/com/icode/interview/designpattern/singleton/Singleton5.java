package com.icode.interview.designpattern.singleton;

/**
 * 懒汉式(线程安全版)
 * 同步方法
 *
 * @author Unicorn
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){
    }

    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            instance = new Singleton5();
        }
        return instance;
    }
}
