package com.icode.interview.designpattern.factory.simpleFactory;

import java.io.*;

/**
 * @author Unicorn
 * @create 2019-09-28 21:02
 */
public class Program {

    public static void main(String[] args) {
        BufferedReader reader = getReader("file", "utf8");

    }

    public static BufferedReader getReader(String filePath, String charsetName) {
        BufferedReader reader = null;
        // 需求: 实例化
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), charsetName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return reader;
    }
}
