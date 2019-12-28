package com.icode.interview.designpattern.decorator.coffeebar.coffee;

/**
 * @author Unicorn
 * @create 2019-09-30 16:28
 */
public class Espresso extends Coffee {

    public Espresso() {
        super.setDescription("Espresso");
        super.setPrice(4.5f);
    }
}
