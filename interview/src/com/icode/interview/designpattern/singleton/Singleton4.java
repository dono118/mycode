package com.icode.interview.designpattern.singleton;

/**
 * 懒汉式(非线程安全版)
 * 线程不安全 延迟加载 效率低
 *
 * @author Unicorn
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
