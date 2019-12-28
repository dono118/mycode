package com.icode.interview.designpattern.factory.factoryMode;

/**
 * @author Unicorn
 * @create 2019-09-28 22:25
 */
public class ToyotaFactory implements Factory {
    @Override
    public Car getCar() {
        return new Toyota();
    }
}
