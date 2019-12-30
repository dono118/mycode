package com.icode.interview.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁 SpinLock
 * 尝试获取锁的线程不会立即阻塞，而是采用循环的方法尝试获取锁
 * 这样的好处是减少线程上下文切换的消耗，缺点是循环会消耗CPU
 *
 * @author Unicorn
 */
public class SpinLockDemo {

    // 原子引用线程
    private AtomicReference<Thread> atomicReference = new AtomicReference<>();

    private void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "\t come in...");
        while (!atomicReference.compareAndSet(null, thread)) {

        }
    }

    private void myUnlock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(thread.getName() + "\t invoked myUnlock()");
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(() -> {
            spinLockDemo.myLock();
            // 暂停一会儿线程
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        }, "AAA").start();

        // 保证上面线程先启动
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnlock();
        }, "BBB").start();
    }
}
