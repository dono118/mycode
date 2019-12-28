package com.icode.interview.designpattern.adapter.demo1;

/**
 * @author Unicorn
 * @create 2019-09-28 19:56
 */
public class Computer {
    private USB usb;

    public void connect(USB usbDevice) {
        this.usb = usbDevice;
    }

    public void showInfo() {
        System.out.println(this.usb.getInfo());
    }
}
