package com.icode.interview.designpattern.singleton.test;



import com.icode.interview.designpattern.singleton.SerializeUtil;
import com.icode.interview.designpattern.singleton.Singleton1;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author Unicorn
 */
public class Singleton1Test {

    @Test
    public void test1() {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton1.getInstance());
                }
            }).start();
        }
    }

    @Test
    public void test3() throws Exception {
        Class<Singleton1> clazz = Singleton1.class;
        Constructor<Singleton1> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = constructor.newInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void test4() {
//        Singleton1 s1 = Singleton1.getInstance();
//        SerializeUtil.serialize(s1);
        Singleton1 s1 = (Singleton1) SerializeUtil.unserialize();
        Singleton1 s2 = (Singleton1) SerializeUtil.unserialize();
        System.out.println(s1 == s2);
    }
}
