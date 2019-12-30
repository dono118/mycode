package com.icode.interview.thread;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ReadWriteLock同Lock一样也是一个接口，提供了readLock和writeLock两种锁的操作机制，一个是只读的锁，一个是写锁
 * 读锁可以在没有写锁的时候被多个线程同时持有，写锁是独占的(排他的)
 * 互斥原则：
 * * 读-读能共存
 * * 读-写不能共存
 * * 写-写不能共存
 *
 * @author Unicorn
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        // 5个线程写操作
        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            new Thread(() -> myCache.put("" + finalI, "" + finalI), String.valueOf(i)).start();
        }

        // 5个线程读操作
        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            new Thread(() -> myCache.get("" + finalI), String.valueOf(i)).start();
        }
    }
}

// 资源类
class MyCache {
    private volatile HashMap<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    void put(String key, Object value) {
        rwLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t正在写入: " + key);
            TimeUnit.MILLISECONDS.sleep(300);
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "\t写入完成...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    void get(String key) {
        rwLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t正在读取...");
            TimeUnit.MILLISECONDS.sleep(300);
            Object value = map.get(key);
            System.out.println(Thread.currentThread().getName() + "\t读取完成: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rwLock.readLock().unlock();
        }
    }
}