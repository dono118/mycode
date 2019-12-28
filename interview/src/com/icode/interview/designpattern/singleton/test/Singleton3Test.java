package com.icode.interview.designpattern.singleton.test;

import com.icode.interview.designpattern.singleton.SerializeUtil;
import com.icode.interview.designpattern.singleton.Singleton3;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author Unicorn
 */
public class Singleton3Test {

    @Test
    public void test1() {
        Singleton3 s1 = Singleton3.INSTANCE;
        Singleton3 s2 = Singleton3.INSTANCE;
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() throws Exception {
        Class<Singleton3> clazz = Singleton3.class;
        Constructor<Singleton3> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 s1 = Singleton3.INSTANCE;
        Singleton3 s2 = constructor.newInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void test3() {
        Singleton3 s1 = Singleton3.INSTANCE;
        SerializeUtil.serialize(s1);
        Singleton3 s2 = (Singleton3) SerializeUtil.unserialize();
        Singleton3 s3 = (Singleton3) SerializeUtil.unserialize();
        System.out.println(s2 == s3);
    }
}
