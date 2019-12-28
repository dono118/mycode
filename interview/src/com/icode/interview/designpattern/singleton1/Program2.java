package com.icode.interview.designpattern.singleton1;

/**
 * @author Unicorn
 * @create 2019-09-28 17:15
 */
public class Program2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Teacher.get();
        }
    }
}

/**
 * 懒汉式
 * 作为一个单例类, 使其在程序中有且只能有一个实例
 */
class Teacher {
    // 1. 私有化构造方法
    private Teacher() {
        System.out.println("一个新的Teacher对象被实例化了...");
    }

    // 2. 设计一个私有的静态的当前类的对象
    private static Teacher instance;

    // 3. 提供一个静态的用来获取当前类对象的方法
    public static Teacher get() {
        if (instance == null) {
            instance = new Teacher();
        }
        return instance;
    }
}