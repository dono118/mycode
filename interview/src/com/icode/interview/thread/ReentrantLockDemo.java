package com.icode.interview.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁指的是可重复可递归调用的锁，在外层使用锁之后，在内层仍然可以使用，并且不发生死锁，这样的锁就叫做可重入锁。
 * 与可重入锁相反，不可重入锁不可递归调用，递归调用就发生死锁
 * synchronized
 * ReentrantLock
 *
 * @author Unicorn
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println("=================== synchronized =========================");
        new Thread(phone::sendSMS, "t1").start();
        new Thread(phone::sendSMS, "t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=================== ReentrantLock =========================");

        Thread t3 = new Thread(phone, "t3");
        Thread t4 = new Thread(phone, "t4");
        t3.start();
        t4.start();
    }
}

class Phone implements Runnable {

    synchronized void sendSMS() {
        System.out.println(Thread.currentThread().getName() + "\t invoked sendSMS()");
        sendEmail();
    }

    private synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName() + "\t #####invoked sendEmail()");
    }

    //========================================
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        get();
    }

    private void get() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked get()");
            set();
        } finally {
            lock.unlock();
        }
    }

    private void set() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t #####invoked set()");
        } finally {
            lock.unlock();
        }
    }
}
