package com.icode.interview.designpattern.singleton;

/**
 * 枚举式
 * 线程安全 支持序列化 反序列化安全 防止反射攻击
 *
 * @author Unicorn
 */
public enum Singleton3 {
    INSTANCE {
        @Override
        protected void doSomething() {
            System.out.println("doSomething");
        }
    };

    protected abstract void doSomething();
}
