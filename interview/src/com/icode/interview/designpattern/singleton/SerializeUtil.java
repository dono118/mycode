package com.icode.interview.designpattern.singleton;

import java.io.*;

/**
 * @author Unicorn
 */
public class SerializeUtil {
    public static void serialize(Object obj) {
        ObjectOutputStream output = null;
        try {
            File file = new File("obj");
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(obj);
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object unserialize() {
        ObjectInputStream input = null;
        try {
            File file = new File("obj");
            input = new ObjectInputStream(new FileInputStream(file));
            Object object = input.readObject();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
