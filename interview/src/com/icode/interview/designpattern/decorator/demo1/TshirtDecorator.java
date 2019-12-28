package com.icode.interview.designpattern.decorator.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 23:44
 */
public class TshirtDecorator extends AbstractDecorator {

    public TshirtDecorator(Decorator obj) {
        super(obj);
    }

    @Override
    public void show() {
        System.out.println("穿了一件T-shirt");
        this.obj.show();
    }
}
