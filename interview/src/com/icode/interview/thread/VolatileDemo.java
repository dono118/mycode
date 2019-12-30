package com.icode.interview.thread;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * volatile 是 Java 提供的一种轻量级的同步机制
 * 具有三大特性:
 *  1.保证可见性
 *  2.不保证原子性
 *    如何保证原子性?
 *      * 加 synchronized
 *      * 使用 juc 包下的 AtomicInteger
 *  3.禁止指令重排
 *
 * @author Unicorn
 */
public class VolatileDemo {

    public static void main(String[] args) {
        MyData myData = new MyData();

        for (int i = 1; i <= 20; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    myData.addPlusPlus();
                    myData.addMyAtomic();
                }
            }, String.valueOf(i)).start();
        }

        // 等待上面的20个线程全部计算完成 再用 main 线程取得 num 最终的值看为多少
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        System.out.println(Thread.currentThread().getName() + "\t int type, finally num value: " + myData.num);
        System.out.println(Thread.currentThread().getName() + "\t AtomicInteger type, finally atomicInteger value: " + myData.atomicInteger);
    }

    /**
     * 验证 volatile 的可见性
     * volatile 可以保证可见性, 及时通知其他线程, 主物理内存的值已经被修改
     */
    private static void VisibilityCheck() {
        MyData myData = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.updateNum();
            System.out.println(Thread.currentThread().getName() + "\t updated num value: " + myData.num);
        }, "AAA").start();

        while (myData.num == 0) {
            // main 线程一直等待, 直到确定 num 值被修改不再为0
        }

        System.out.println(Thread.currentThread().getName() + "\t mission is over, main got num value: " + myData.num);
    }
}

class MyData {
    volatile int num = 0;

    public void updateNum() {
        this.num = 60;
    }

    public void addPlusPlus() {
        num++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addMyAtomic() {
        atomicInteger.getAndIncrement();
    }
}