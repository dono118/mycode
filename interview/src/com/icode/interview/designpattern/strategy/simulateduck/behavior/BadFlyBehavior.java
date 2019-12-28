package com.icode.interview.designpattern.strategy.simulateduck.behavior;

/**
 * @author Unicorn
 * @create 2019-09-29 14:55
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-- Bad Fly --");
    }
}
