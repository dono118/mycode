package com.icode.interview.designpattern.singleton.test;

import com.icode.interview.designpattern.singleton.Singleton2;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author Unicorn
 */
public class Singleton2Test {

    @Test
    public void test1() {
//        Singleton2 s1 = Singleton2.getInstance();
//        Singleton2 s2 = Singleton2.getInstance();
//        System.out.println(s1 == s2);
        try {
            Class.forName("com.dono.episode1.Singleton2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws Exception {
        Class<Singleton2> clazz = Singleton2.class;
        Constructor<Singleton2> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
//        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = constructor.newInstance();
//        System.out.println(s1 == s2);
    }
}
