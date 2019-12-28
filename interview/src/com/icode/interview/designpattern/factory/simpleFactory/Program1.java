package com.icode.interview.designpattern.factory.simpleFactory;

/**
 * @author Unicorn
 * @create 2019-09-28 21:37
 */
public class Program1 {
    public static void main(String[] args) {
        // 需要获取一辆宝马汽车
        Car bmw = Factory.getCar("BMW");

        Car audi = Factory.getCar("Audi");
    }
}
