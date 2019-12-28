package com.icode.interview.designpattern.strategy.simulateduck.duck;

import com.icode.interview.designpattern.strategy.simulateduck.behavior.GagaQuackBehavior;
import com.icode.interview.designpattern.strategy.simulateduck.behavior.GoodFlyBehavior;

/**
 * @author Unicorn
 * @create 2019-09-29 15:03
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GagaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("*** Green Head ***");
    }
}
