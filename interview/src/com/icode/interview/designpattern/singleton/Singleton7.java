package com.icode.interview.designpattern.singleton;

/**
 * ThreadLocal
 * 不加锁 以空间换时间
 * 为每个线程提供变量的独立副本,可以保证各自线程中是单例的,但是不同线程之间不保证
 *
 * @author Unicorn
 */
public class Singleton7 {

    private Singleton7() {
    }

    private static final ThreadLocal<Singleton7> threadLocalSingleton = new ThreadLocal<Singleton7>(){
        @Override
        protected Singleton7 initialValue() {
            return new Singleton7();
        }
    };

    public static Singleton7 getInstance() {
        return threadLocalSingleton.get();
    }
}
