package com.icode.interview.designpattern.decorator.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 23:40
 */
public class ShoesDecorator extends AbstractDecorator {

    public ShoesDecorator(Decorator obj) {
        super(obj);
    }

    @Override
    public void show() {
        System.out.println("穿了一双鞋");
        this.obj.show();
    }
}
