package com.icode.interview.designpattern.singleton.test;

import com.icode.interview.designpattern.singleton.Singleton4;
import org.junit.Test;

import java.io.IOException;

/**
 * @author Unicorn
 */
public class Singleton4Test {

    @Test
    public void test1() {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton4.getInstance());
                }
            }).start();
        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
