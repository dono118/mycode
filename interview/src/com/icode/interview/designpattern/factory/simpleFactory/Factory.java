package com.icode.interview.designpattern.factory.simpleFactory;

/**
 * @author Unicorn
 * @create 2019-09-28 21:29
 */
public class Factory {

    // 汽车工厂类, 需要提供一个方法, 可以返回一个Car的对象
    public static Car getCar(String name) {
        if (name.equals("BMW")) {
            return new BMW();
        }
        else if (name.equals("Audi")) {
            return new Audi();
        }
        else if (name.equals("BYD")) {
            return new BYD();
        }
        else {
            return null;
        }
    }
}
