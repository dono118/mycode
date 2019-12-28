package com.icode.interview.designpattern.strategy.simulateduck.behavior;

/**
 * @author Unicorn
 * @create 2019-09-29 13:36
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-- Good Fly --");
    }
}
