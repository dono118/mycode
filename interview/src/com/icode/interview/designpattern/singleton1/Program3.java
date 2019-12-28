package com.icode.interview.designpattern.singleton1;

/**
 * @author Unicorn
 * @create 2019-09-28 19:23
 */
public class Program3 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(() -> {
                Chairman.getInstance();
            });
            t.start();
        }
    }
}

/**
 * 懒汉式-多线程版
 * 作为一个单例类, 使其在程序中有且只能有一个实例
 */
class Chairman {
    private Chairman() {
        System.out.println("一个新的对象被实例化了...");
    }

    private static Chairman instance;

    public static synchronized Chairman getInstance() {
        if (instance == null) {
            instance = new Chairman();
        }
        return instance;
    }
}