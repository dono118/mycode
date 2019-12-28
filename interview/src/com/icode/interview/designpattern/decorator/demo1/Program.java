package com.icode.interview.designpattern.decorator.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 23:46
 */
public class Program {

    public static void main(String[] args) {
        // 需要一个穿着鞋的人
        ShoesDecorator p1 = new ShoesDecorator(new Person());
        p1.show();

        // 需要一个同时穿了鞋和T恤的人
        ShoesDecorator p2 = new ShoesDecorator(new TshirtDecorator(new Person()));
        p2.show();
    }
}
