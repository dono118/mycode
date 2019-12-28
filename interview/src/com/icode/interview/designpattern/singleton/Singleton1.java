package com.icode.interview.designpattern.singleton;

import java.io.Serializable;

/**
 * 饿汉式
 * 线程安全 反射不安全 反序列化不安全
 *
 * @author Unicorn
 */
public class Singleton1 implements Serializable {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
