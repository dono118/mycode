package com.icode.interview.designpattern.strategy.simulateduck;

import com.icode.interview.designpattern.strategy.simulateduck.behavior.NoFlyBehavior;
import com.icode.interview.designpattern.strategy.simulateduck.duck.Duck;
import com.icode.interview.designpattern.strategy.simulateduck.duck.GreenHeadDuck;
import com.icode.interview.designpattern.strategy.simulateduck.duck.RedHeadDuck;

/**
 * @author Unicorn
 * @create 2019-09-29 15:06
 */
public class SimulateDuck {

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.fly();
        greenHeadDuck.quack();
        greenHeadDuck.swim();

        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.swim();

        redHeadDuck.setFlyBehavior(new NoFlyBehavior());
        redHeadDuck.fly();
    }
}
