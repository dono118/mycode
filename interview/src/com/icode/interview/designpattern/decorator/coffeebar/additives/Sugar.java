package com.icode.interview.designpattern.decorator.coffeebar.additives;

import com.icode.interview.designpattern.decorator.coffeebar.Drink;

/**
 * @author Unicorn
 * @create 2019-09-30 16:39
 */
public class Sugar extends Additives {

    public Sugar(Drink drink) {
        super(drink);
        super.setDescription("Sugar");
        super.setPrice(1.0f);
    }
}
