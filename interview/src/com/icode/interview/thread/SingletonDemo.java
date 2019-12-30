package com.icode.interview.thread;

/**
 * @author Unicorn
 */
public class SingletonDemo {

    // 加 volatile 关键字, 禁止指令重排
    private static volatile SingletonDemo instance = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 我是构造方法SingletonDemo()");
    }

    // DCL (Double Checked Locking 双重检查锁定模式)
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 单线程
//        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());

        // 多线程
        for (int i = 1; i <= 10; i++) {
            new Thread(SingletonDemo::getInstance, String.valueOf(i)).start();
        }
    }

}
