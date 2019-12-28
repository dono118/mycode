package com.icode.interview.designpattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS(比较与交换,Compare and swap)是一种有名的无锁算法
 *
 * @author Unicorn
 */
public class Singleton8 {
    private static final AtomicReference<Singleton8> instance = new AtomicReference<>();

    private Singleton8() {
        System.out.println("Singleton8 loaded");
    }

    public static final Singleton8 getInstance() {
        for (; ; ) {
            Singleton8 current = instance.get();
            if (current != null) {
                return current;
            }
            current = new Singleton8();
            if (instance.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
