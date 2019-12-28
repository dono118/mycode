package com.icode.interview.designpattern.factory.factoryMode;

/**
 * @author Unicorn
 * @create 2019-09-28 22:14
 */
public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
