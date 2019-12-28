package com.icode.interview.designpattern.decorator.coffeebar.coffee;


import com.icode.interview.designpattern.decorator.coffeebar.Drink;

/**
 * @author Unicorn
 * @create 2019-09-30 16:27
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
