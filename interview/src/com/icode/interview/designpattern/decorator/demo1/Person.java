package com.icode.interview.designpattern.decorator.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 23:35
 */
public class Person implements Decorator {
    @Override
    public void show() {
        System.out.println("一个人站立");
    }
}
