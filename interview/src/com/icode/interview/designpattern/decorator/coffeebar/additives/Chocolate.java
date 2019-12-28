package com.icode.interview.designpattern.decorator.coffeebar.additives;

import com.icode.interview.designpattern.decorator.coffeebar.Drink;

/**
 * @author Unicorn
 * @create 2019-09-30 16:37
 */
public class Chocolate extends Additives {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(2.0f);
    }
}
