package com.icode.interview.designpattern.decorator.coffeebar.additives;

import com.icode.interview.designpattern.decorator.coffeebar.Drink;

/**
 * @author Unicorn
 * @create 2019-09-30 16:38
 */
public class Additives extends Drink {
    private Drink drink;

    public Additives(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + drink.getDescription();
    }
}
