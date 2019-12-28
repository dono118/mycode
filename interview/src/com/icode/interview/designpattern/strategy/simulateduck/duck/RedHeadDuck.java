package com.icode.interview.designpattern.strategy.simulateduck.duck;

import com.icode.interview.designpattern.strategy.simulateduck.behavior.BadFlyBehavior;
import com.icode.interview.designpattern.strategy.simulateduck.behavior.GeGeQuackBehavior;

/**
 * @author Unicorn
 * @create 2019-09-29 15:05
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("*** Red Head ***");
    }
}
