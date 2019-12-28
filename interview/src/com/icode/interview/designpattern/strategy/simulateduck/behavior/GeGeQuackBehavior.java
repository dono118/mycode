package com.icode.interview.designpattern.strategy.simulateduck.behavior;

/**
 * @author Unicorn
 * @create 2019-09-29 15:02
 */
public class GeGeQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-- Ge Ge --");
    }
}
