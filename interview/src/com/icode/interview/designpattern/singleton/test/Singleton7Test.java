package com.icode.interview.designpattern.singleton.test;

import com.icode.interview.designpattern.singleton.Singleton7;
import org.junit.Test;

import java.io.IOException;

/**
 * @author Unicorn
 */
public class Singleton7Test {

    @Test
    public void test1() {
        Singleton7 s1 = Singleton7.getInstance();
        Singleton7 s2 = Singleton7.getInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void test2() {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton7 s1 = Singleton7.getInstance();
                    Singleton7 s2 = Singleton7.getInstance();
                    System.out.println(Thread.currentThread().getName() + "," + (s1 == s2) + " " + s1);
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
