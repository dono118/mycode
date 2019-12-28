package com.icode.interview.designpattern.strategy.simulateduck.duck;

import com.icode.interview.designpattern.strategy.simulateduck.behavior.FlyBehavior;
import com.icode.interview.designpattern.strategy.simulateduck.behavior.QuackBehavior;

/**
 * @author Unicorn
 * @create 2019-09-29 13:02
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("I am swimming~~~~~~");
    }
}
