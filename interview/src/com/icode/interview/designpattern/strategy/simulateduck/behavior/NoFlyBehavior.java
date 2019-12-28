package com.icode.interview.designpattern.strategy.simulateduck.behavior;

/**
 * @author Unicorn
 * @create 2019-09-29 15:23
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-- No Fly --");
    }
}
