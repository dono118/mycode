package com.icode.interview.designpattern.decorator.myio;

import java.io.*;

/**
 * @author Unicorn
 * @create 2019-09-30 17:56
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("E:\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
