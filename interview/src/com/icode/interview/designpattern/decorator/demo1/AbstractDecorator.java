package com.icode.interview.designpattern.decorator.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 23:38
 */
public abstract class AbstractDecorator implements Decorator {
    protected Decorator obj;

    public AbstractDecorator(Decorator obj) {
        this.obj = obj;
    }
}
