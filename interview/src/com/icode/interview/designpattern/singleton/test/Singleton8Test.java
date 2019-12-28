package com.icode.interview.designpattern.singleton.test;

import com.icode.interview.designpattern.singleton.Singleton8;
import org.junit.Test;

import java.io.IOException;

/**
 * @author Unicorn
 */
public class Singleton8Test {

    @Test
    public void test1() {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton8.getInstance());
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
