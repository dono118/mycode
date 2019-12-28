package com.icode.interview.designpattern.singleton1;

/**
 * @author Unicorn
 * @create 2019-09-28 16:29
 */
public class Program1 {
    public static void main(String[] args) {
        // 通过单例类指定的方法, 进行对象的获取
        User user = User.getUser();
        for (int i = 0; i < 100; i++) {
            User u = User.getUser();
            if (user != u) {
                System.out.println("一个新的对象被实例化了...");
            }
        }
        System.out.println("程序运行结束");
    }
}

/**
 * 饿汉式
 * 作为一个单例类, 使其在程序中有且只能有一个实例
 */
class User {
    // 1. 私有化构造方法
    private User() {}

    // 2. 设计一个私有的静态的当前类的对象
    private static User instance = new User();

    /*static {
        instance = new User();
    }*/

    // 3. 提供一个静态的方法, 可以返回给调用方一个当前类对象
    public static User getUser() {
        return instance;
    }
}