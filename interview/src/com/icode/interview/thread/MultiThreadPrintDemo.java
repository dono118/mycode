package com.icode.interview.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程题之轮流打印A 5次, B 10次, C 15次
 * 本次用ReentrantLock,因为ReentrantLock相比Synchronized可以指定唤醒具体的某一个线程,得益于ReentrantLock的绑定条件Condition
 * 工作流程分为三步:
 * 1. 线程操作资源类
 * 2. 具体的某个线程干活
 * 3. 干完活通知其他线程
 *
 * @author Unicorn
 */
public class MultiThreadPrintDemo {

    public static void main(String[] args) {
        //开启线程调动资源类
        ShareResource sr = new ShareResource();
        for (int i = 0; i < 3; i++) {
            new Thread(sr::print5, "A").start();
            new Thread(sr::print10, "B").start();
            new Thread(sr::print15, "C").start();
        }
    }
}

//资源类
class ShareResource {
    private int number = 1; //通过控制 number来执行具体的线程 1-A 2-B 3-C
    private ReentrantLock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    void print5() {
        lock.lock();
        try {
            while (number != 1) {
                c1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知下一个线程
            number = 2;
            c2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void print10() {
        lock.lock();
        try {
            while (number != 2) {
                c2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知下一个线程
            number = 3;
            c3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void print15() {
        lock.lock();
        try {
            while (number != 3) {
                c3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知下一个线程
            number = 1;
            c1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}