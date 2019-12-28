package com.icode.interview.designpattern.singleton;

/**
 * 登记式
 * 线程安全 防止反射攻击 反序列化不安全
 *
 * @author Unicorn
 */
public class Singleton2 {

    private static class SingletonHolder {
        private static Singleton2 instance = new Singleton2();
    }

    private Singleton2(){
        System.out.println("Singleton2 loaded");
        if (SingletonHolder.instance != null) {
            throw new IllegalStateException();
        }
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
