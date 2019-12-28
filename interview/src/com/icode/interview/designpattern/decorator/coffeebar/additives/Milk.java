package com.icode.interview.designpattern.decorator.coffeebar.additives;

import com.icode.interview.designpattern.decorator.coffeebar.Drink;

/**
 * @author Unicorn
 * @create 2019-09-30 16:38
 */
public class Milk extends Additives {

    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(1.5f);
    }
}
