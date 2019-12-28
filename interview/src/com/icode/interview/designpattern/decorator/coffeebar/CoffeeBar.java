package com.icode.interview.designpattern.decorator.coffeebar;

import com.icode.interview.designpattern.decorator.coffeebar.additives.Chocolate;
import com.icode.interview.designpattern.decorator.coffeebar.additives.Milk;
import com.icode.interview.designpattern.decorator.coffeebar.coffee.Decaf;
import com.icode.interview.designpattern.decorator.coffeebar.coffee.LongBlack;

/**
 * @author Unicorn
 * @create 2019-09-30 16:20
 */
public class CoffeeBar {

    public static void main(String[] args) {

        Drink order;
        order = new Decaf();
        System.out.println("order1 price: " + order.getPrice());
        System.out.println("order1 desc: " + order.getDescription());

        System.out.println("********************************");

        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price: " + order.cost());
        System.out.println("order2 desc: " + order.getDescription());
    }
}
