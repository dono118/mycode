package com.icode.interview.designpattern.strategy.simulateduck.behavior;

/**
 * @author Unicorn
 * @create 2019-09-29 14:56
 */
public class GagaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-- Ga Ga --");
    }
}
