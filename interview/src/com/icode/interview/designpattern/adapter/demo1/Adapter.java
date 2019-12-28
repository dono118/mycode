package com.icode.interview.designpattern.adapter.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 20:04
 */
public class Adapter implements USB {

    private TypeC device;

    public Adapter(TypeC device) {
        this.device = device;
    }

    @Override
    public String getInfo() {
        return this.device.getInfo();
    }
}
