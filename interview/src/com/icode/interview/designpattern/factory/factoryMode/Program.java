package com.icode.interview.designpattern.factory.factoryMode;

/**
 * @author Unicorn
 * @create 2019-09-28 22:15
 */
public class Program {

    public static void main(String[] args) {
        // 需要一辆宝马汽车
        Car bmw = new BMWFactory().getCar();

        // 需要一辆奥迪汽车
        Car audi = new AudiFactory().getCar();

        // 需要一辆丰田汽车
        Car toyota = new ToyotaFactory().getCar();
    }
}
