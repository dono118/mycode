package com.icode.interview.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS: Compare and Swap, 即比较再交换
 *
 * @author Unicorn
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2019);

        Boolean bool = atomicInteger.compareAndSet(2019,2020);
        System.out.println(bool);
        System.out.println(atomicInteger.get());
        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger.get());
    }
}
